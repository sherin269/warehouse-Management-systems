
package com.sheri.wms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sheri.wms.dto.ItemDto;
import com.sheri.wms.service.ItemService;

@Controller
public class ItemController 
{

	
	@Autowired
	ItemService itemService;
	
	@RequestMapping("/getItemList")
	public ModelAndView getItemList(HttpServletRequest request, 
			@RequestParam(value = "itemId", required = false) Integer itemId) 
	{
		
		//Object userSession = request.getSession().getAttribute("userSession");
		
		ItemDto itemDto = new ItemDto();
		if(null != itemId) {
			itemDto = itemService.getItem(itemId);
		}
		
		List<ItemDto> itemList = itemService.getItems();
		ModelAndView mv = new ModelAndView("items");
		//mv.addObject("message", message);
		mv.addObject("itemList", itemList);
		mv.addObject("newItem", itemDto);
		//mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/deleteItem")
	public ModelAndView deleteItem(@RequestParam(value = "itemId", required = false) Integer itemId) {
		
		ItemDto itemDto = new ItemDto();
		if(itemId != null) {
			itemService.deleteItem(itemId);
		}
		
		List<ItemDto> itemList = itemService.getItems();
		ModelAndView mv = new ModelAndView("items");
		//mv.addObject("message", message);
		mv.addObject("itemList", itemList);
		mv.addObject("newItem", itemDto);
		//mv.addObject("name", name);
		return mv;
	}
	
	
	@RequestMapping("/saveItem")
	public ModelAndView saveItem(@Valid @ModelAttribute("newItem") ItemDto item, BindingResult result) {
		
		if(!result.hasErrors()) {
			itemService.saveItem(item);
		}
		
		List<ItemDto> itemList = itemService.getItems();
		ModelAndView mv = new ModelAndView("items");
		mv.addObject("itemList", itemList);
		if(result.hasErrors()) {
			mv.addObject("newItem", item);
		}else {
			mv.addObject("newItem", new ItemDto());
		}
		return mv;
	}
}
