package com.sheri.wms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sheri.wms.dto.ILPNDto;
import com.sheri.wms.service.ILPNService;






@Controller
public class ILPNController 
{
	
	@Autowired
	ILPNService ilpnservice;
	@RequestMapping("/receiving") 
	
	public ModelAndView receiving()
	{
		ModelAndView mv=new ModelAndView("receive");
		ILPNDto ilpnDto= new ILPNDto();
		mv.addObject("newilpn", ilpnDto);
		return mv;
	}
	
	@RequestMapping("/receiveLpn") 
	public ModelAndView receiveLpn(@ModelAttribute ILPNDto iLpnDto)
	{
		ModelAndView mv=new ModelAndView("receive");
	
		ilpnservice.receiveLpn(iLpnDto);
		if(iLpnDto.hasErrors())
			mv.addObject("newilpn", iLpnDto);
		else
		{
			ILPNDto newIlpnDto= new ILPNDto();
			
			newIlpnDto.addInformations("LPN "+iLpnDto.getIlpnNumber()+" has been received successfuly");
			mv.addObject("newilpn", newIlpnDto);
		}
			
		
		
		return mv;
	}
	

}
