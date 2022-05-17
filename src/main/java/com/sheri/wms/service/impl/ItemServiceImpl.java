package com.sheri.wms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.ItemDao;
import com.sheri.wms.dto.ItemDto;
import com.sheri.wms.entity.ItemEntity;
import com.sheri.wms.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public List<ItemDto> getItems()
	{
		List<ItemEntity> itemEntityList = itemDao.getItems();
		List<ItemDto> itemDtoList = new ArrayList<ItemDto>();
		for (ItemEntity itemEntity : itemEntityList) {
			itemDtoList.add(modelMapper.map(itemEntity, ItemDto.class));
		}
		
		return itemDtoList;
	}

	@Override
	public void saveItem(ItemDto item) {
		ItemEntity itemEntity=modelMapper.map(item, ItemEntity.class);
		itemDao.saveItem(itemEntity);
		
	}

	@Override
	public ItemDto getItem(Integer itemId) {
		return modelMapper.map(itemDao.getItemById(itemId), ItemDto.class);
	}
	
	@Override
	public void deleteItem(Integer itemId) 
	{
		 itemDao.deleteItem(itemId);
	}

}
