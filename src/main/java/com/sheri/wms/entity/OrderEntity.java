package com.sheri.wms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class OrderEntity extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private Integer orderId;
	
	@Column(name="ORDER_NUMBER")
	private String orderNumber;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="QTY")
	private Integer qty;

	
	@Column(name="SHIP_TO_NAME")
	private String shipToName;
	
	@Column(name="SHIP_TO_ADDRESS")
	private String shipToAddress;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getShipToName() {
		return shipToName;
	}

	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	public String getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	




}
