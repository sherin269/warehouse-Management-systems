package com.sheri.wms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.InventoryDao;
import com.sheri.wms.dao.ListPageDao;
import com.sheri.wms.dao.LocationDao;
import com.sheri.wms.dao.TaskDao;
import com.sheri.wms.dto.InventoryDto;
import com.sheri.wms.dto.TaskDto;
import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.LocationEntity;
import com.sheri.wms.entity.TaskEntity;
import com.sheri.wms.service.ListPageService;


@Service
public class ListPageServiceImpl implements ListPageService {

	@Autowired
	ListPageDao listPageDao;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	LocationDao locationDao;
	@Autowired
	TaskDao taskPageDao;
	@Autowired
	 InventoryDao inventoryDao;
	
	@Override
	public List<InventoryDto> getInventories() 
	{
		List<InventoryEntity> inventoryEntityList = listPageDao.getInventories();
		System.out.println("Inventory Size is : "+inventoryEntityList.size());
		List<InventoryDto> inventoryDtoList = new ArrayList<InventoryDto>();
		
		
		for (InventoryEntity inventoryEntity : inventoryEntityList)
		{
			
			
			InventoryDto inventoryDto=new InventoryDto();
			
			inventoryDto.setItemName(inventoryEntity.getItemEntity().getItemName());
			inventoryDto.setOnHandQty(inventoryEntity.getOnhandQty());
			inventoryDto.setAllocatedQty(inventoryEntity.getAllocatedQty());
			inventoryDto.setLocationBarcode(inventoryEntity.getLocationEntity().getBarcode());
			inventoryDtoList.add(inventoryDto);
			
		}	
		
		
		return inventoryDtoList;
	}

	@Override
	public List<TaskDto> getTasks() 
	{
		List<TaskEntity> taskEntityList = listPageDao.getTasks();
		System.out.println("Task Size is : "+taskEntityList.size());
		List<TaskDto> taskDtoList = new ArrayList<TaskDto>();
		
		
		for (TaskEntity taskEntity : taskEntityList)
		{
			TaskDto taskDto=new TaskDto();
			taskDto.setTaskId(taskEntity.getTaskId());
			taskDto.setOrderNumber(taskEntity.getOrderNumber());
			taskDto.setLocationBarcode(taskEntity.getLocationEntity().getBarcode());
			taskDto.setItemName(taskEntity.getItemEntity().getItemName());
			taskDto.setQty(taskEntity.getQty());
			String status="Created";
			if(taskEntity.getStatus()==200)
			{
				
				status="Completed";
			}
			taskDto.setStatus(status);
			taskDto.setOlpnNumber("OLPN000"+taskEntity.getTaskId());
			taskDtoList.add(taskDto);
			
			
		}
		
		return taskDtoList;
	}

}
