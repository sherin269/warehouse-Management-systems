package com.sheri.wms.dao;


import java.util.List;

import com.sheri.wms.entity.TaskEntity;

public interface TaskDao 
{
	public boolean saveTask(TaskEntity taskEntity);
	public List<TaskEntity>getTaskEntity();
	public TaskEntity getTaskForUser();
	public TaskEntity getTaskEntityById(Integer taskId);
	public TaskEntity getTaskEntityByItemId(Integer itemId);
}
