package com.seiryo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.dao.OrderDao;
import com.seiryo.entity.My_order_info;
import com.seiryo.utile.JDBCUTILE;

public class OrderDaoImpl implements OrderDao{
	/**
	 * 根据用户ID查询订单,优先展示当前用户
	 */
	@Override
	public List<My_order_info> queryOrderById(Integer id,String name) {
		List<My_order_info> list = new ArrayList<My_order_info>();
		ResultSet rs = null;
		String sql = "select m1.*, m2.* from my_order m1 left join my_order_info m2 on m1.order_id = m2.order_id where user_id = ? order by case when m2.order_beneficiary_name = ? then 1 else 0 end desc";
		try {
			rs = JDBCUTILE.selectDataBaseTable(sql, id,name);
			while (rs.next()) {
				My_order_info info = new My_order_info();
				
				info.setOrder_id(rs.getString("order_id"));
	            info.setUser_id(rs.getInt("user_id"));
	            info.setCommodity_id(rs.getInt("commodity_id"));
	            info.setOrder_info_id(rs.getInt("order_info_id"));
	            info.setOrder_commodity_liability1(rs.getString("order_commodity_liability1"));
	            info.setOrder_commodity_liability2(rs.getString("order_commodity_liability2"));
	            info.setOrder_commodity_liability3(rs.getString("order_commodity_liability3"));
	            info.setOrder_commodity_liability4(rs.getString("order_commodity_liability4"));
	            info.setOrder_commodity_liability5(rs.getString("order_commodity_liability5"));
	            info.setOrder_commodity_liability6(rs.getString("order_commodity_liability6"));
	            info.setOrder_commodity_liability7(rs.getString("order_commodity_liability7"));
	            info.setOrder_beneficiary_name(rs.getString("order_beneficiary_name"));
	            info.setOrder_beneficiary_city(rs.getString("order_beneficiary_city"));
	            info.setOrder_beneficiary_phone(rs.getString("order_beneficiary_phone"));
	            info.setOrder_commodity_time_start(rs.getString("order_commodity_time_start"));
	            info.setOrder_commodity_time_end(rs.getString("order_commodity_time_end"));
	            info.setOrder_commodity_time_length(rs.getString("order_commodity_time_length"));
	            info.setOrder_sum_price(rs.getString("order_sum_price"));
	            
				list.add(info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
	        try {
	            JDBCUTILE.dbClose(rs, null, null);
	        } catch (Exception e2) {
	            e2.printStackTrace();
	        }
	    }
		return list;
	}

	@Override
	public boolean insertOrder(String orderId, Integer userId, Integer commodityId, String li1, String li2,
			String li3, String li4, String li5, String li6, String li7, String beneName, String beneCity,
			String benePhone, String timeStart, String timeEnd, String timeLen, String sumPrice) {
		boolean bo = false;
		String sql1 = "insert into my_order(order_id,user_id,commodity_id) values (?,?,?)";
		String sql2 = "insert into my_order_info(" +
				"order_id," +
				"order_commodity_liability1,order_commodity_liability2,order_commodity_liability3," +
				"order_commodity_liability4,order_commodity_liability5,order_commodity_liability6,order_commodity_liability7," +
				"order_beneficiary_name,order_beneficiary_city,order_beneficiary_phone," +
				"order_commodity_time_start,order_commodity_time_end,order_commodity_time_length," +
				"order_sum_price) " +
				"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			bo = JDBCUTILE.upDataBaseTable(sql1, orderId,userId,commodityId);
			if (bo) {
				bo = JDBCUTILE.upDataBaseTable(sql2, orderId, li1, li2, li3, li4, li5, li6, li7,
				beneName, beneCity, benePhone,timeStart,timeEnd, timeLen, sumPrice);
			}
		} catch (Exception e) {
			e.printStackTrace();
			bo = false;
		}
		return bo;
	}

	

}
