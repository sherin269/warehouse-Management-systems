package com.sheri.wms.dao;

import com.sheri.wms.entity.UserEntity;

public interface UserDao 
{
	public UserEntity getUser(String username);

}
