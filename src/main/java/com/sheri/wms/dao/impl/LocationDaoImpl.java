package com.sheri.wms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.LocationDao;
import com.sheri.wms.entity.LocationEntity;
@Repository

public class LocationDaoImpl implements LocationDao
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<LocationEntity> getLocations()
	{
		List<LocationEntity> locationEtityList = sessionFactory.getCurrentSession().createQuery("from LocationEntity").list();
		return locationEtityList;
		
	}

	@Override
	
	@Transactional
	public boolean saveLocation(LocationEntity locationEntity)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(locationEntity);
			return true;
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			return false;
		}
		
	}

	@Override
	@Transactional
	public LocationEntity getLocation(Integer locationId)
	{
		LocationEntity locn;
		locn=(LocationEntity)sessionFactory.getCurrentSession().get(LocationEntity.class,locationId);
		return locn;
	}

	@Override
	@Transactional
	public void deleteLocation(Integer locationId)
	{
		LocationEntity locn=new LocationEntity();
		locn.setLocationId(locationId);
		sessionFactory.getCurrentSession().delete(locn);
	}
	@Override
	@Transactional
	public LocationEntity getLocationByBarcode(String barcode)
	{
		List<LocationEntity>locnEntities;
		
		locnEntities=sessionFactory.getCurrentSession().createQuery("from LocationEntity where barcode='"+barcode+"'").list();
		if(locnEntities.size()>0)
		{
			return locnEntities.get(0);
		}
		else
			return null;
	}
	
	
	

}


