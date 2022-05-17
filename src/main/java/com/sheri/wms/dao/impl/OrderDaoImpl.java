package com.sheri.wms.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sheri.wms.dao.OrderDao;
import com.sheri.wms.entity.ItemEntity;
import com.sheri.wms.entity.OrderEntity;
@Repository
@Transactional
public class OrderDaoImpl implements OrderDao 
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean saveOrder(OrderEntity orderEntity) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(orderEntity);
		return false;
	}

	@Override
	public OrderEntity getOrderByNumber(String orderNumber)
	{
		
		List<OrderEntity> orderList=sessionFactory.getCurrentSession().createQuery("from OrderEntity where orderNumber='"+orderNumber+"'").list();
		if(orderList.size()>0)
			return orderList.get(0);
		else
			return null;
	}
	
	
	
}
