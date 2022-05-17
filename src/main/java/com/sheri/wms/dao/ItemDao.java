package com.sheri.wms.dao;

import java.util.List;

import com.sheri.wms.entity.ItemEntity;

public interface ItemDao {
	public List<ItemEntity> getItems();

	boolean saveItem(ItemEntity itemEntity);

	

	public void deleteItem(Integer itemId);
	public ItemEntity getItemByItemName(String itemName);

	ItemEntity getItemById(Integer itemId);
}
