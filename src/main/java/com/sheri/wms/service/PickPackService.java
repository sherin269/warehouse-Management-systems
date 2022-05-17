package com.sheri.wms.service;

import com.sheri.wms.dto.PutawayDto;
import com.sheri.wms.dto.TaskDto;

public interface PickPackService
{


	public TaskDto getTaskForUser();

	public TaskDto updateTaskStatus(TaskDto taskDto);
	

}
