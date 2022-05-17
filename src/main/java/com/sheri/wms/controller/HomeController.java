package com.sheri.wms.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sheri.wms.dto.UserDto;
import com.sheri.wms.service.UserService;

@Controller
public class HomeController 
{

	@Autowired
	UserService userSerice;
	
	
	@RequestMapping("/")
	public ModelAndView itemHome(HttpSession session, HttpServletResponse response)
	{
		//session.setAttribute("userSession", new UserSession("asifc","Asif","Nalakath"));
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("userDto", new UserDto());
		return mv;
	}
	@RequestMapping("/validateCredentials")
	public ModelAndView validateCredentials(HttpSession session, HttpServletResponse response,@ModelAttribute("userDto") UserDto userDto) 
	{
		session.setAttribute("userSession", new UserDto("asifc","Shereena","Nalakath"));																																	
		UserDto sessionFromDB=userSerice.validateUser(userDto);
		ModelAndView mv =new ModelAndView();
		if(sessionFromDB==null)
		{
			mv.setViewName("login");
		}else
		{
			mv.setViewName("home");
		}
		
		System.out.println("*************************LoadHomePage******");
		return mv;
	}
		
	@RequestMapping("/home")
	public ModelAndView goHome(HttpSession session, HttpServletResponse response)
	{
		
		ModelAndView mv = new ModelAndView("home");
		//mv.addObject("userDto", new UserSession());
		return mv;
	}
	
}
