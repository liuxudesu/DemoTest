package com.seiryo.service;

import java.util.List;

import com.seiryo.entity.My_order_info;

public interface OrderService {
	
	//根据用户ID查询订单优先展示当前用户
	List<My_order_info> queryOrderById(Integer id,String name);
	
	//新增订单
		boolean insertOrder(String orderId,
		 Integer userId,
		 Integer commodityId,
		 String li1, String li2, String li3, String li4, String li5, String li6, String li7,
		 String beneName, String beneCity, String benePhone,
		 String timeStart, String timeEnd, String timeLen,
		 String sumPrice);
}
