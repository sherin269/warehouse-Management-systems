package com.sheri.wms.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sheri.wms.dto.OrderDto;
import com.sheri.wms.dto.UserDto;
import com.sheri.wms.service.OrderService;



@RestController
public class OrderController 
{	@Autowired
	OrderService orderService;
	
	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST,produces = "application/json")
	 public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto)
	{
	  HttpHeaders headers = new HttpHeaders();
	  if (orderDto == null) 
	  {
		 return new ResponseEntity<OrderDto>(HttpStatus.BAD_REQUEST);
	  }

	  else 
	  {
		  orderService.saveOrder(orderDto);
		  
		 
	  }
	 
	 
	  System.out.println("End of order creation.....");
	  return new ResponseEntity<OrderDto>(orderDto, headers, HttpStatus.OK);
	 }
	

}
