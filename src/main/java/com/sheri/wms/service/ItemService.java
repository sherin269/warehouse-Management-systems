package com.sheri.wms.service;

import java.util.List;

import com.sheri.wms.dto.ItemDto;


public interface ItemService
{

	public List<ItemDto> getItems();

	public void saveItem(ItemDto item);

	public ItemDto getItem(Integer itemId);

	public void deleteItem(Integer itemId);
	
}
