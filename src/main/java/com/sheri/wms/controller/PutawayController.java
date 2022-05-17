package com.sheri.wms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sheri.wms.dto.PutawayDto;
import com.sheri.wms.service.PutawayService;


@Controller
public class PutawayController
{
	@Autowired
	PutawayService putawayService;
	@RequestMapping("/putaway")
	public ModelAndView putaway()
	{
		ModelAndView mv=new ModelAndView("putaway");
		PutawayDto pdto=new PutawayDto();
		mv.addObject("newpdto", pdto);
		return mv;
	}
	@RequestMapping("/putawayILPN")
	public ModelAndView putawayLpn(PutawayDto pdto)
	{
		ModelAndView mv=new ModelAndView("putaway");
		putawayService.putawayILPN(pdto);
		if(pdto.hasErrors())
		{
			mv.addObject("newpdto", pdto);
			
		}
		else
		{
			
			PutawayDto npdto=new PutawayDto();		
			npdto.addInformations("Putaway hasbeen completed succeccsfully. Proceed with next putaway");
			mv.addObject("newpdto", npdto);
		}
		return mv;
	}

}
