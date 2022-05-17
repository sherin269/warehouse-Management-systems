package com.sheri.wms.dto;

public class InventoryDto {
	private String itemName;
	private String locationBarcode;
	private Integer onHandQty;
	private Integer allocatedQty;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getLocationBarcode() {
		return locationBarcode;
	}
	public void setLocationBarcode(String locationBarcode) {
		this.locationBarcode = locationBarcode;
	}
	public Integer getOnHandQty() {
		return onHandQty;
	}
	public void setOnHandQty(Integer onHandQty) {
		this.onHandQty = onHandQty;
	}
	public Integer getAllocatedQty() {
		return allocatedQty;
	}
	public void setAllocatedQty(Integer allocatedQty) {
		this.allocatedQty = allocatedQty;
	}

	
}
