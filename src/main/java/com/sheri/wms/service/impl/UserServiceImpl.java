package com.sheri.wms.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheri.wms.dao.UserDao;
import com.sheri.wms.dto.UserDto;
import com.sheri.wms.entity.UserEntity;
import com.sheri.wms.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao userDao;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public UserDto validateUser(UserDto session)
	{
		UserEntity userEntity=userDao.getUser(session.getUserName());
		if(userEntity!=null)
		{
			if(userEntity.getPassword().equals(session.getPassword()))
			{
				return modelMapper.map(userEntity, UserDto.class);
			}
			
		}
		return null;
		
	}

}
