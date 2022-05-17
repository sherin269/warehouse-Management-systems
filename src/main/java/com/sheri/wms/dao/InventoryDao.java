package com.sheri.wms.dao;

import com.sheri.wms.entity.InventoryEntity;


public interface InventoryDao
{

	 public boolean saveInventory(InventoryEntity inventoryEntity);
	 public InventoryEntity getInventoryByItemName(String itemName);
	 public InventoryEntity getInventoryByIdAndQty(Integer itemId,Integer qty);
	 public InventoryEntity getInventoryByItemNameAndLocationBarcode(String itemName,String locationBarcode);
}
