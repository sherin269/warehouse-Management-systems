package com.sheri.wms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="INVENTORY")

public class InventoryEntity extends BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="INVENTORY_ID")
	private Integer inventoryId;
	
	@Column(name="LPN_NUMBER")
	private Integer lpnNumber;
	
	@ManyToOne(cascade=CascadeType.ALL)  
	private ItemEntity itemEntity;
	
	@Column(name="ONHAND_QTY")
	private Integer onhandQty;
	
	@ManyToOne(cascade=CascadeType.ALL)  
	private LocationEntity locationEntity;
	
	@Column(name="ALLOCATED_QTY")
	private Integer allocatedQty;

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getLpnNumber() {
		return lpnNumber;
	}

	public void setLpnNumber(Integer lpnNumber) {
		this.lpnNumber = lpnNumber;
	}

	public ItemEntity getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(ItemEntity itemEntity) {
		this.itemEntity = itemEntity;
	}

	public Integer getOnhandQty() {
		return onhandQty;
	}

	public void setOnhandQty(Integer onhandQty) {
		this.onhandQty = onhandQty;
	}


	public Integer getAllocatedQty() {
		return allocatedQty;
	}

	public void setAllocatedQty(Integer allocatedQty) {
		this.allocatedQty = allocatedQty;
	}

	public LocationEntity getLocationEntity() {
		return locationEntity;
	}

	public void setLocationEntity(LocationEntity locationEntity) {
		this.locationEntity = locationEntity;
	}
	
	
	
}
