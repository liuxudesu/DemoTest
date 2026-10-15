package com.seiryo.dao;

import java.util.List;

import com.seiryo.entity.MyUserInfo;

/**
 * 
 * @ClassName: UserDao  
 * @Description: TODO(用户数据层接口)  
 * @author 10748  
 * @date 2025年10月14日
 */
public interface UserDao {
	
	//插入用户
	boolean insertUser(MyUserInfo myUserInfo);
	
	//查询所有用户信息
	List<MyUserInfo> selectAllUserInfo();
	
	//用户更新	
	boolean updateUser(Integer id,String pass,String phone,String money);
	
	//根据id查询用户	
	MyUserInfo queryUserById(Integer id);
	
	//根据电话查询用户
	MyUserInfo queryUserByPhone(String insurePhone);
	
	//根据保险总价改变余额
	void changeMoneyById(String priceStr, Integer id);
}
