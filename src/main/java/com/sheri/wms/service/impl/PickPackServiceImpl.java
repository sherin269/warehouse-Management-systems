package com.sheri.wms.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.InventoryDao;
import com.sheri.wms.dao.TaskDao;
import com.sheri.wms.dto.TaskDto;
import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.TaskEntity;
import com.sheri.wms.service.PickPackService;
@Service
public class PickPackServiceImpl implements PickPackService
{	
	
	@Autowired
	TaskDao taskDao;
	@Autowired
	InventoryDao inventoryDao;
	
	ModelMapper modelMapper=new ModelMapper();
	
	@Override
	public TaskDto getTaskForUser()
	{
		TaskEntity taskEntity=taskDao.getTaskForUser();
		TaskDto taskDto=new TaskDto();
		if(taskEntity!=null)
		{
			taskDto.setTaskId(taskEntity.getTaskId());
			taskDto.setOrderNumber(taskEntity.getOrderNumber());
			taskDto.setLocationBarcode(taskEntity.getLocationEntity().getBarcode());
			taskDto.setItemName(taskEntity.getItemEntity().getItemName());
			taskDto.setQty(taskEntity.getQty());
			taskDto.setOlpnNumber("OLPN000"+taskEntity.getTaskId());
		}
		else
		{
			taskDto.addError("No Tasks Available for execution.....");
		}
		return taskDto;
		
	}
	
	@Override
	public TaskDto updateTaskStatus(TaskDto taskDto)
	{
		if(taskDto==null || taskDto.getTaskId()==null)
		{
			taskDto.addError("No Task available for packing");
			
			
		}
		else
		{
			TaskEntity taskEntity=taskDao.getTaskEntityById(taskDto.getTaskId());
			taskEntity.setStatus(200);
			taskDao.saveTask(taskEntity);
			InventoryEntity inventoryEntity=inventoryDao.getInventoryByItemNameAndLocationBarcode(taskEntity.getItemEntity().getItemName(), taskEntity.getLocationEntity().getBarcode());
			inventoryEntity.setAllocatedQty(inventoryEntity.getAllocatedQty()-taskEntity.getQty());
			inventoryEntity.setOnhandQty(inventoryEntity.getOnhandQty()-taskEntity.getQty());
			inventoryDao.saveInventory(inventoryEntity);
		}
		return taskDto;
	}
}
