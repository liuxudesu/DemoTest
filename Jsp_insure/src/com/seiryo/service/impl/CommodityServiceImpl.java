package com.seiryo.service.impl;

import java.util.List;

import com.seiryo.dao.CommodityDao;
import com.seiryo.dao.impl.CommodityDaoImpl;
import com.seiryo.entity.Commodity;
import com.seiryo.entity.Commodity_liability_info;
import com.seiryo.entity.MyUserInfo;
import com.seiryo.service.CommodityService;

public class CommodityServiceImpl implements CommodityService{
	CommodityDao dao = new CommodityDaoImpl();
	
	@Override
	public List<Commodity> selectAllCommodity(Integer age) {
		return dao.selectAllCommodity(age);
	}

	@Override
	public Commodity queryCommodityById(Integer id) {
		return dao.queryCommodityById(id);
	}

	@Override
	public List<Commodity> queryCommodityByType(Integer type) {
		return dao.queryCommodityByType(type);
	}

	@Override
	public Commodity_liability_info queryCommodity_liability_infoById(Integer id) {
		return dao.queryCommodity_liability_infoById(id);
	}
	
	

}
