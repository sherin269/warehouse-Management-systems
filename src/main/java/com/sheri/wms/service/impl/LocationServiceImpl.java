package com.sheri.wms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.LocationDao;
import com.sheri.wms.dto.LocationDto;
import com.sheri.wms.entity.LocationEntity;
import com.sheri.wms.service.LocationService;
@Service
public class LocationServiceImpl implements LocationService
{
	@Autowired
	LocationDao locationDao;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<LocationDto>getLocations()
	{
		List<LocationEntity> locn=locationDao.getLocations();
		List<LocationDto>locndto=new ArrayList<>();
		for(LocationEntity i:locn)
		{
			locndto.add(modelMapper.map(i, LocationDto.class));
		}
		return locndto;
	}

	@Override
	public void saveLocation(LocationDto location) 
	{
		
		LocationEntity locn=modelMapper.map(location, LocationEntity.class);
	
		locationDao.saveLocation(locn);
		
		
	}

	@Override
	public LocationDto getLocation(Integer locationId)
	{
		LocationEntity locn=locationDao.getLocation(locationId);
		LocationDto locnDto=modelMapper.map(locn, LocationDto.class);
		return locnDto;
	}

	@Override
	public void deleteLocation(Integer locationId)
	{
		modelMapper.map(locationId,LocationEntity.class);
		locationDao.deleteLocation(locationId);
		
	}

}
