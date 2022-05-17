package com.sheri.wms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.TaskDao;
import com.sheri.wms.entity.TaskEntity;
@Repository
@Transactional
public class TaskDaoImpl implements TaskDao
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveTask(TaskEntity taskEntity)
	{
		sessionFactory .getCurrentSession().saveOrUpdate(taskEntity);
		return true;
	}
	@Override
	public List<TaskEntity> getTaskEntity()
	{
		List<TaskEntity>taskEntityList=sessionFactory.getCurrentSession().createQuery("from TaskEntity").list();
		return taskEntityList;
	}
	
	@Override
	public TaskEntity getTaskForUser()
	{
		List<TaskEntity>taskEntityList=sessionFactory.getCurrentSession().createQuery("from TaskEntity where status=100 order by taskId ").list();
		if(taskEntityList!=null && taskEntityList.size()>0)
			return taskEntityList.get(0);
		return null;
	}
	@Override
	public TaskEntity getTaskEntityById(Integer taskId)
	{
		TaskEntity taskEntity=(TaskEntity)sessionFactory.getCurrentSession().get(TaskEntity.class,taskId);
		return taskEntity;
	}
	@Override
	public TaskEntity getTaskEntityByItemId(Integer itemId)
	{
		TaskEntity taskEntity;
	
		List<TaskEntity>taskEntityList=sessionFactory.getCurrentSession().createQuery("from TaskEntity where itemEntity.itemId="+itemId).list();
		
		if(taskEntityList!=null && taskEntityList.size()>0)
			return taskEntityList.get(0);
		return null;
	}
}
