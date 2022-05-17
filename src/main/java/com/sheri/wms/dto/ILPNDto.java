package com.sheri.wms.dto;



/**
 * @author 14703
 *
 */

public class ILPNDto extends ParentDto
{

	private Integer ilpnId;
	private String ilpnNumber;
	private String itemName;
	private Integer itemId;
	private Integer qty;
	private String batch;
	
	private Integer status;

	public Integer getIlpnId() {
		return ilpnId;
	}

	public void setIlpnId(Integer ilpnId) {
		this.ilpnId = ilpnId;
	}

	public String getIlpnNumber() {
		return ilpnNumber;
	}

	public void setIlpnNumber(String ilpnNumber) {
		this.ilpnNumber = ilpnNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
	
}
