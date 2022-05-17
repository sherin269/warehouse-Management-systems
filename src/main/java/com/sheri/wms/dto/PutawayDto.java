package com.sheri.wms.dto;

public class PutawayDto extends ParentDto
{

	private String lpnNumber;
	private String locationBarcode;
	public String getLpnNumber() {
		return lpnNumber;
	}
	public void setLpnNumber(String lpnNumber) {
		this.lpnNumber = lpnNumber;
	}
	public String getLocationBarcode() {
		return locationBarcode;
	}
	public void setLocationBarcode(String locationBarcode) {
		this.locationBarcode = locationBarcode;
	}
}
