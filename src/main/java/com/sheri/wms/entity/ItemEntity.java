package com.sheri.wms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="ITEM_MASTER")

public class ItemEntity extends BaseEntity{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ITEM_ID")
	private Integer itemId;
	@Column(name="ITEM_NAME")
	private String itemName;
	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;
	@Column(name="ITEM_CATEGORY")
	private String itemCategory;
	
	
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	
}
