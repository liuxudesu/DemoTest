package com.seiryo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.seiryo.dao.OrderDao;
import com.seiryo.dao.impl.OrderDaoImpl;
import com.seiryo.entity.My_order_info;
import com.seiryo.service.OrderService;

public class OrderServiceImpl implements OrderService{
	OrderDao dao = new OrderDaoImpl();
	
	@Override
	public List<My_order_info> queryOrderById(Integer id,String name) {
		return dao.queryOrderById(id,name);
	}

	@Override
	public boolean insertOrder(String orderId, Integer userId, Integer commodityId, String li1, String li2, String li3,
			String li4, String li5, String li6, String li7, String beneName, String beneCity, String benePhone,
			String timeStart, String timeEnd, String timeLen, String sumPrice) {
		return dao.insertOrder(orderId, userId, commodityId, li1, li2, li3, li4, li5, li6, li7, beneName, beneCity, benePhone, timeStart, timeEnd, timeLen, sumPrice);
	}
	
	
}
