package com.sheri.wms.dao;

import com.sheri.wms.entity.OrderEntity;

public interface OrderDao 
{
	public boolean saveOrder(OrderEntity orderEntity);
	public OrderEntity getOrderByNumber(String orderNumber);

}
