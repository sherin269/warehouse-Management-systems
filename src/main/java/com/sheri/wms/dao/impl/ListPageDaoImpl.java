package com.sheri.wms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.ListPageDao;
import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.TaskEntity;

@Repository
@Transactional
public class ListPageDaoImpl implements ListPageDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<InventoryEntity> getInventories()
	{
		List<InventoryEntity> inventoryEntityList = sessionFactory.getCurrentSession().createQuery("from InventoryEntity").list();
		return inventoryEntityList;
		
	}
	@Override
	public List<TaskEntity> getTasks()
	{
		List<TaskEntity> taskEntityList = sessionFactory.getCurrentSession().createQuery("from TaskEntity").list();
		return taskEntityList;
		
	}
	
   
}
