package com.sheri.wms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="LOCATION")

public class LocationEntity extends BaseEntity{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="LOCATION_ID")
	private Integer locationId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="BARCODE")
	private String barcode;
	
	@Column(name="MAX_UNITS")
	private Integer maxUnits;
	
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Integer getMaxUnits() {
		return maxUnits;
	}
	public void setMaxUnits(Integer maxUnits) {
		this.maxUnits = maxUnits;
	}
	
	
	
}
