package com.sheri.wms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sheri.wms.dto.InventoryDto;
import com.sheri.wms.dto.TaskDto;
import com.sheri.wms.service.ListPageService;

@Controller
public class ListPageController {
	@Autowired
	ListPageService listPageService;

	@RequestMapping("/getInventories")
	public ModelAndView getInventories() {

		ModelAndView mv = new ModelAndView("inventory");

		List<InventoryDto> listdto = listPageService.getInventories();
		mv.addObject("inventoryList", listdto);

		return mv;
	}

	@RequestMapping("/getTasks")
	public ModelAndView getTasks() {

		ModelAndView mv = new ModelAndView("tasks");

		List<TaskDto> listdto = listPageService.getTasks();
		mv.addObject("tasksList", listdto);

		return mv;
	}

}
