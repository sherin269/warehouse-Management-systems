package com.sheri.wms.dto;

public class TaskDto extends ParentDto
{

	private Integer taskId;
	private String orderNumber;
	private String itemName;
	private String locationBarcode;
	private Integer qty;
	private String status;
	private String olpnNumber;
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
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
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public String getOlpnNumber() {
		return olpnNumber;
	}
	public void setOlpnNumber(String olpnNumber) {
		this.olpnNumber = olpnNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
