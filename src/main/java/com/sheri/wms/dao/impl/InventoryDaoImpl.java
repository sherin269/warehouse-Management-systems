package com.sheri.wms.dao.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.InventoryDao;
import com.sheri.wms.entity.InventoryEntity;
import com.sheri.wms.entity.ItemEntity;

@Repository
@Transactional
public class InventoryDaoImpl implements InventoryDao
{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean saveInventory(InventoryEntity inventoryEntity)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(inventoryEntity);
			return true;
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			return false;
		}
	}

	@Override
	public InventoryEntity getInventoryByItemName(String itemName)
	{
		List<InventoryEntity> inventoryList=sessionFactory.getCurrentSession().createQuery("from InventoryEntity where itemName='"+itemName+"'").list();
		if(inventoryList.size()>0)
			return inventoryList.get(0);
		else
			return null;
	}
	@Override
	@Transactional
	public InventoryEntity getInventoryByIdAndQty(Integer itemId, Integer qty) {
		
		List<InventoryEntity> inventoryList=sessionFactory.getCurrentSession().createQuery("from InventoryEntity where itemEntity.itemId='"+itemId+"' AND onhandQty > allocatedQty + "+qty).list();
		if(inventoryList.size()>0)
			return inventoryList.get(0);
		else
			return null;
	}

	@Override
	public InventoryEntity getInventoryByItemNameAndLocationBarcode(String itemName, String locationBarcode )
	{
		List<InventoryEntity> inventoryList=sessionFactory.getCurrentSession().createQuery("from InventoryEntity where itemEntity.itemName='"+itemName+"' AND locationEntity.barcode='"+locationBarcode+"'").list();
		if(inventoryList.size()>0)
			return inventoryList.get(0);
		else
			return null;
	
	}

}

