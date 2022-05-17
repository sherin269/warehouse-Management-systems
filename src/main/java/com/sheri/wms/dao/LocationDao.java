package com.sheri.wms.dao;

import java.util.List;

import com.sheri.wms.entity.LocationEntity;

public interface LocationDao {
	public List<LocationEntity> getLocations();

	boolean saveLocation(LocationEntity locationEntity);

	public LocationEntity getLocation(Integer locationId);

	public void deleteLocation(Integer locationId);

	LocationEntity getLocationByBarcode(String barcode);
}
