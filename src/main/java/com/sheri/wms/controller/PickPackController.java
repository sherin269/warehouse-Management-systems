package com.sheri.wms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sheri.wms.dto.TaskDto;
import com.sheri.wms.service.PickPackService;
import com.sheri.wms.service.PutawayService;


@Controller
public class PickPackController
{
	@Autowired
	PutawayService putawayService;
	
	@Autowired
	PickPackService pickPackService;
	
	
	@RequestMapping("/pickpack")
	public ModelAndView pickpack()
	{
		ModelAndView mv=new ModelAndView("pickpack");
		TaskDto newTaskDto=pickPackService.getTaskForUser();
		mv.addObject("newTaskDto", newTaskDto);
		return mv;
	}
	
	@RequestMapping("/packoLPN")
	public ModelAndView packoLPN(@ModelAttribute TaskDto taskDto)
	{
		ModelAndView mv=new ModelAndView("pickpack");
		pickPackService.updateTaskStatus(taskDto);
		if(!taskDto.hasErrors())
		{
			
			TaskDto newTaskDto=pickPackService.getTaskForUser();
			newTaskDto.addInformations("OLPN000"+taskDto.getTaskId()+ " has been packed succesfully... Continue with next oLPN Packing..");
			mv.addObject("newTaskDto", newTaskDto);
			
			
		}
		else
		{
			
				
			taskDto.addInformations("Unexpected Error happened. Please contact Admin....");
			mv.addObject("newTaskDto", taskDto);
		}
		return mv;
	}

}
