package com.sheri.wms.dto;

import javax.validation.constraints.Size;

public class ItemDto {

	private Integer itemId;
    @Size(min=1,message="Item Name Cannot be empty")  
	private String itemName;
	private String itemDescription;
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
