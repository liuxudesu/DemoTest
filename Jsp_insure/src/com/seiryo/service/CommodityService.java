package com.seiryo.service;

import java.util.List;

import com.seiryo.entity.Commodity;
import com.seiryo.entity.Commodity_liability_info;
import com.seiryo.entity.MyUserInfo;

public interface CommodityService {
	//查询所有保险信息
	List<Commodity> selectAllCommodity(Integer age);
		
	//根据id查询保险	
	Commodity queryCommodityById(Integer id);
	
	//根据类型查询保险
	List<Commodity> queryCommodityByType(Integer type);
	
	//根据id查询保险详情
	Commodity_liability_info queryCommodity_liability_infoById(Integer id);
}
