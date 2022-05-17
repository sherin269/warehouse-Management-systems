package com.sheri.wms.dao.impl;import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.UserDao;
import com.sheri.wms.entity.UserEntity;
@Repository
@Transactional
public class UserDaoImpl implements UserDao
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public UserEntity getUser(String username)
	{
		UserEntity userentity=(UserEntity)sessionFactory.getCurrentSession().get(UserEntity.class,username);
		return userentity;
	}

}
