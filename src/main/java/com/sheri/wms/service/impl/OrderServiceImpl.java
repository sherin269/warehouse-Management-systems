package com.sheri.wms.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.InventoryDao;
import com.sheri.wms.dao.ItemDao;
import com.sheri.wms.dao.LocationDao;
import com.sheri.wms.dao.OrderDao;
import com.sheri.wms.dao.TaskDao;
import com.sheri.wms.dto.OrderDto;
import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.ItemEntity;
import com.sheri.wms.entity.OrderEntity;
import com.sheri.wms.entity.TaskEntity;
import com.sheri.wms.service.OrderService;
import com.sheri.wms.utils.GeneralUtils;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	InventoryDao inventoryDao;
	@Autowired
	ItemDao itemDao;
	@Autowired
	OrderDao orderDao;
	@Autowired
	LocationDao locationDao;
	@Autowired
	TaskDao taskDao;

	ModelMapper modelMapper = new ModelMapper();

	public void saveOrder(OrderDto orderDto) 
	{
		TaskEntity taskEntity=new TaskEntity();
		validateOrder(orderDto,taskEntity);

		if (!orderDto.hasErrors()) {
			OrderEntity orderEntity = modelMapper.map(orderDto, OrderEntity.class);
			orderDao.saveOrder(orderEntity);
			orderDto.addInformations("Order has been created in the system");
			generateTask(orderDto,taskEntity);
			orderDto.addInformations("PickPack Task has been generated in the system and ready to be executed");

		} else
			return;

	} // public void validateOrder(orderDto)

	private void generateTask(OrderDto orderDto,TaskEntity taskEntity) {
		
		InventoryEntity inventoryEntity = inventoryDao.getInventoryByIdAndQty(taskEntity.getItemEntity().getItemId(),orderDto.getQty());
		if (inventoryEntity == null) {
			orderDto.addError("item " + orderDto.getItemName() + " does not have enough stock...");
			System.out.println("Not enough inventory..");
			return;
		} 
	
		
		taskEntity.setOrderNumber(orderDto.getOrderNumber());
		taskEntity.setQty(orderDto.getQty());
		taskEntity.setItemEntity(inventoryEntity.getItemEntity());
		taskEntity.setLocationEntity(inventoryEntity.getLocationEntity());
		taskEntity.setStatus(100);
		
		taskDao.saveTask(taskEntity);
		
		
		inventoryEntity.setAllocatedQty(inventoryEntity.getAllocatedQty()+taskEntity.getQty());
		inventoryDao.saveInventory(inventoryEntity);
		
	
	
		
	}

	private void validateOrder(OrderDto orderDto, TaskEntity taskEntity) {
		GeneralUtils generalUtils = new GeneralUtils();
		
		OrderEntity orderEntity=orderDao.getOrderByNumber(orderDto.getOrderNumber());
		if(orderEntity!=null)
		{
			orderDto.addError("Order already exist in the system. Duplicate order is not allowed");
		}
		
		if (generalUtils.isNullOrEmpty(orderDto.getItemName())) {
			orderDto.addError("Item Name should not be Empty");

		}
		ItemEntity itemEntity = (ItemEntity) itemDao.getItemByItemName(orderDto.getItemName());
		if (itemEntity == null) {
			
			orderDto.addError("item " + orderDto.getItemName() + " does not exist... please try with valid item");
		}else
		{
			taskEntity.setItemEntity(itemEntity);
		}
		
		if (generalUtils.isNullOrEmpty(orderDto.getOrderNumber())) {
			orderDto.addError("Enter proper Order Number");

		}

		if (generalUtils.isNullOrEmpty(orderDto.getShipToName())) {
			orderDto.addError("Order should have recipient name");
		}
		if (orderDto.getQty() == null || orderDto.getQty() < 1) {
			orderDto.addError("QTY should be atleast one");
		}
	}

}
