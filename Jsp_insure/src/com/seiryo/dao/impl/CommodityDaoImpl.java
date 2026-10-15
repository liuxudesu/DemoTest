package com.seiryo.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.seiryo.dao.CommodityDao;
import com.seiryo.entity.Commodity;
import com.seiryo.entity.Commodity_liability_info;
import com.seiryo.utile.JDBCUTILE;

public class CommodityDaoImpl implements CommodityDao{
	/**
	 *查询所有保险信息,登陆后优先匹配年龄区间内的
	 */
	@Override
	public List<Commodity> selectAllCommodity(Integer age) {
		String sql = null;
		if (age!=null) {
			sql = "SELECT * from commodity order by case when ? between commodity_age_start and commodity_age_end then 0 else 1 end asc";
		}else {
			sql = "SELECT * from commodity order by commodity_id";
		}
		ResultSet rest = null;
		List<Commodity> list = new ArrayList<Commodity>();
		try {
			if (age!=null) {
				rest = JDBCUTILE.selectDataBaseTable(sql,age);
			}else {
				rest = JDBCUTILE.selectDataBaseTable(sql);
			}
			while(rest.next()) {
				Commodity commodity = new Commodity();
				commodity.setCommodity_id(rest.getInt("commodity_id"));
				commodity.setCommodity_name(rest.getString("commodity_name"));
				commodity.setCommodity_price(rest.getString("commodity_price"));
				commodity.setCommodity_introduce(rest.getString("commodity_introduce"));
				commodity.setCommodity_img(rest.getString("commodity_img"));
				commodity.setCommodity_age_start(rest.getInt("commodity_age_start"));
				commodity.setCommodity_age_end(rest.getInt("commodity_age_end"));
				commodity.setCommodity_time_length(rest.getString("commodity_time_length"));
				commodity.setCommodity_applicable_gender(rest.getInt("commodity_applicable_gender"));
				commodity.setCommodity_applicable_location(rest.getString("commodity_applicable_location"));
				commodity.setCommodity_signing_form(rest.getString("commodity_signing_form"));
				commodity.setCommodity_liability_zjs(rest.getString("commodity_liability_zjs"));
				commodity.setCommodity_detailed_information1(rest.getString("commodity_detailed_information1"));
				commodity.setCommodity_detailed_information2(rest.getString("commodity_detailed_information2"));
				commodity.setCommodity_detailed_information3(rest.getString("commodity_detailed_information3"));
				commodity.setCommodity_type(rest.getString("commodity_type"));
				list.add(commodity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JDBCUTILE.dbClose(rest, null, null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * 根据id查询保险信息
	 */
	@Override
	public Commodity queryCommodityById(Integer id) {
		String sql = "SELECT * from commodity where commodity_id = ?";
		ResultSet rest = null;
		Commodity commodity = null;
		try {
			rest = JDBCUTILE.selectDataBaseTable(sql,id);
			while(rest.next()) {
				commodity = new Commodity();
				commodity.setCommodity_id(rest.getInt("commodity_id"));
				commodity.setCommodity_name(rest.getString("commodity_name"));
				commodity.setCommodity_price(rest.getString("commodity_price"));
				commodity.setCommodity_introduce(rest.getString("commodity_introduce"));
				commodity.setCommodity_img(rest.getString("commodity_img"));
				commodity.setCommodity_age_start(rest.getInt("commodity_age_start"));
				commodity.setCommodity_age_end(rest.getInt("commodity_age_end"));
				commodity.setCommodity_time_length(rest.getString("commodity_time_length"));
				commodity.setCommodity_applicable_gender(rest.getInt("commodity_applicable_gender"));
				commodity.setCommodity_applicable_location(rest.getString("commodity_applicable_location"));
				commodity.setCommodity_signing_form(rest.getString("commodity_signing_form"));
				commodity.setCommodity_liability_zjs(rest.getString("commodity_liability_zjs"));
				commodity.setCommodity_detailed_information1(rest.getString("commodity_detailed_information1"));
				commodity.setCommodity_detailed_information2(rest.getString("commodity_detailed_information2"));
				commodity.setCommodity_detailed_information3(rest.getString("commodity_detailed_information3"));
				commodity.setCommodity_type(rest.getString("commodity_type"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JDBCUTILE.dbClose(rest, null, null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return commodity;
	}
	/**
	 * 根据类型查询保险信息
	 */
	@Override
	public List<Commodity> queryCommodityByType(Integer type) {
		String sql = "SELECT * from commodity where commodity_type = ?";
		ResultSet rest = null;
		List<Commodity> list = new ArrayList<Commodity>();
		try {
			rest = JDBCUTILE.selectDataBaseTable(sql,type);
			while(rest.next()) {
				Commodity commodity = new Commodity();
				commodity.setCommodity_id(rest.getInt("commodity_id"));
				commodity.setCommodity_name(rest.getString("commodity_name"));
				commodity.setCommodity_price(rest.getString("commodity_price"));
				commodity.setCommodity_introduce(rest.getString("commodity_introduce"));
				commodity.setCommodity_img(rest.getString("commodity_img"));
				commodity.setCommodity_age_start(rest.getInt("commodity_age_start"));
				commodity.setCommodity_age_end(rest.getInt("commodity_age_end"));
				commodity.setCommodity_time_length(rest.getString("commodity_time_length"));
				commodity.setCommodity_applicable_gender(rest.getInt("commodity_applicable_gender"));
				commodity.setCommodity_applicable_location(rest.getString("commodity_applicable_location"));
				commodity.setCommodity_signing_form(rest.getString("commodity_signing_form"));
				commodity.setCommodity_liability_zjs(rest.getString("commodity_liability_zjs"));
				commodity.setCommodity_detailed_information1(rest.getString("commodity_detailed_information1"));
				commodity.setCommodity_detailed_information2(rest.getString("commodity_detailed_information2"));
				commodity.setCommodity_detailed_information3(rest.getString("commodity_detailed_information3"));
				commodity.setCommodity_type(rest.getString("commodity_type"));
				list.add(commodity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JDBCUTILE.dbClose(rest, null, null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	@Override
	public Commodity_liability_info queryCommodity_liability_infoById(Integer id) {
		String sql = "select c.*,cli.* from commodity c left join commodity_liability_info cli on c.commodity_id = cli.commodity_id where c.commodity_id = ?";
		ResultSet rest = null;
		Commodity_liability_info commodity = null;
		try {
			rest = JDBCUTILE.selectDataBaseTable(sql,id);
			while(rest.next()) {
				commodity = new Commodity_liability_info();
				commodity.setCommodity_liability_info_id(rest.getInt("commodity_liability_info_id"));
				commodity.setCommodity_name(rest.getString("commodity_name"));
				commodity.setCommodity_price(rest.getString("commodity_price"));
				commodity.setCommodity_introduce(rest.getString("commodity_introduce"));
				commodity.setCommodity_img(rest.getString("commodity_img"));
				commodity.setCommodity_age_start(rest.getInt("commodity_age_start"));
				commodity.setCommodity_age_end(rest.getInt("commodity_age_end"));
				commodity.setCommodity_time_length(rest.getString("commodity_time_length"));
				commodity.setCommodity_applicable_gender(rest.getInt("commodity_applicable_gender"));
				commodity.setCommodity_applicable_location(rest.getString("commodity_applicable_location"));
				commodity.setCommodity_signing_form(rest.getString("commodity_signing_form"));
				commodity.setCommodity_liability_zjs(rest.getString("commodity_liability_zjs"));
				commodity.setCommodity_detailed_information1(rest.getString("commodity_detailed_information1"));
				commodity.setCommodity_detailed_information2(rest.getString("commodity_detailed_information2"));
				commodity.setCommodity_detailed_information3(rest.getString("commodity_detailed_information3"));
				commodity.setCommodity_type(rest.getString("commodity_type"));
				commodity.setCommodity_id(rest.getInt("commodity_id"));
				commodity.setCommodity_liability_info1(rest.getString("commodity_liability_info1"));
			    commodity.setCommodity_liability_info2(rest.getString("commodity_liability_info2"));
			    commodity.setCommodity_liability_info3(rest.getString("commodity_liability_info3"));
			    commodity.setCommodity_liability_info4(rest.getString("commodity_liability_info4"));
			    commodity.setCommodity_liability_info5(rest.getString("commodity_liability_info5"));
			    commodity.setCommodity_liability_info6(rest.getString("commodity_liability_info6"));
			    commodity.setCommodity_liability_info7(rest.getString("commodity_liability_info7"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JDBCUTILE.dbClose(rest, null, null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return commodity;
	}
	
	

}
