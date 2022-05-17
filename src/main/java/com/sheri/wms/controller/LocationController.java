package com.sheri.wms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sheri.wms.dto.LocationDto;
import com.sheri.wms.service.LocationService;



@Controller
public class LocationController 
{
	@Autowired
	LocationService locationService;
	@RequestMapping("/getLocations")
	public ModelAndView getLocations(@RequestParam(value = "locationId", required = false) Integer locationId)
	{
		LocationDto ldto=null;
		ModelAndView mv=new ModelAndView("location");
		if(locationId!=null)
		{
			 ldto=locationService.getLocation(locationId);
			
		}
		else
		{
			ldto=new LocationDto();
		}
		
		 
			List<LocationDto>listdto=locationService.getLocations();
			mv.addObject("locationList",listdto);
			mv.addObject("newLocation",ldto);
			return mv;
	}
	@RequestMapping("/saveLocation")
	public ModelAndView saveLocation( @ModelAttribute LocationDto lDto)
	{
		ModelAndView mv=new ModelAndView("location");
		locationService.saveLocation(lDto);
		LocationDto ldto=new LocationDto();
		List<LocationDto>listdto=locationService.getLocations();
		mv.addObject("locationList",listdto);
		mv.addObject("newLocation",ldto);
		return mv;
	}
	@RequestMapping("/deleteLocation")
	public ModelAndView deleteLocation (@ModelAttribute LocationDto lDto)
	{
		ModelAndView mv=new ModelAndView("location");
		locationService.deleteLocation(lDto.getLocationId());
		System.out.println("LoctionId:"+lDto.getLocationId()+", Name:"+lDto.getName()+", Barcode:"+lDto.getBarcode());
		LocationDto ldto=new LocationDto();
		List<LocationDto>listdto=locationService.getLocations();
		mv.addObject("locationList",listdto);
		mv.addObject("newLocation",ldto);
		return mv;
	}
	
}

