package com.sheri.wms.dto;



public class LocationDto
{
	
	private Integer locationId;
	
	private String name;
	
	private String barcode;

	private Integer maxUnits;

	public Integer getLocationId()
	{
		return locationId;
	}

	public void setLocationId(Integer locationId)
	{
		this.locationId = locationId;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBarcode()
	{
		return barcode;
	}

	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}

	public Integer getMaxUnits()
	{
		return maxUnits;
	}

	public void setMaxUnits(Integer maxUnits) 
	{
		this.maxUnits = maxUnits;
	}
	
}
