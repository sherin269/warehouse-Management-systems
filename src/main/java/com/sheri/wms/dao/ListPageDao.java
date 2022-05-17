package com.sheri.wms.dao;

import java.util.List;

import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.TaskEntity;

public interface ListPageDao 
{
	public List<InventoryEntity> getInventories();

	public List<TaskEntity> getTasks();
	

}
