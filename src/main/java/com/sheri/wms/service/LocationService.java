package com.sheri.wms.service;

import java.util.List;



import com.sheri.wms.dto.LocationDto;



public interface LocationService
{
	public List<LocationDto> getLocations();

	public void saveLocation(LocationDto location);

	public LocationDto getLocation(Integer locationId);

	public void deleteLocation(Integer locationId);

}
