package com.sheri.wms.service;

import org.springframework.stereotype.Service;

import com.sheri.wms.dto.UserDto;

@Service
public interface UserService 
{
	public UserDto validateUser(UserDto session);

}
