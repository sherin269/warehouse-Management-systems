package com.sheri.wms.service;

import java.util.List;

import com.sheri.wms.dto.InventoryDto;
import com.sheri.wms.dto.TaskDto;

public interface ListPageService {
	public List<InventoryDto> getInventories();
	public List<TaskDto>getTasks();
	
}
