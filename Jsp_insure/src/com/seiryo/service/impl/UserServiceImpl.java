package com.seiryo.service.impl;

import java.util.List;

import com.seiryo.dao.UserDao;
import com.seiryo.dao.impl.UserDaoImpl;
import com.seiryo.entity.MyUserInfo;
import com.seiryo.service.UserService;

/**
 * 
 * @ClassName: UserServiceImpl  
 * @Description: TODO(用户服务层实现类)  
 * @author 10748  
 * @date 2025年10月14日
 */
public class UserServiceImpl implements UserService{
	
	//接口指向实现类
	private UserDao userDao = new UserDaoImpl();

	/**
	 * 新增用户
	 */
	@Override
	public boolean insertUser(MyUserInfo myUserInfo) {
		return userDao.insertUser(myUserInfo);
	}

	/**
	 * 查询所有用户信息
	 */
	@Override
	public List<MyUserInfo> selectAllUserInfo() {
		return userDao.selectAllUserInfo();
	}

	/**
	 * 判断用户邮箱是否重复
	 */
	@Override
	public boolean pdUserEmail(String email) {
		List<MyUserInfo> userList = userDao.selectAllUserInfo();
		if(userList.size() > 0) {
			for(MyUserInfo user:userList) {
				if(user.getUser_email().equals(email)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 用户登录
	 */
	@Override
	public MyUserInfo pdUserLogin(String email, String pass) {
		List<MyUserInfo> userList = userDao.selectAllUserInfo();
		if(userList.size() > 0) {
			for(MyUserInfo user:userList) {
				if(user.getUser_email().equals(email)) {
					if(user.getUser_password().equals(pass)) {
						return user;
					}
				}
			}
		}
		return null;
	}
	/**
	 * 用户更新
	 */
	@Override
	public boolean updateUser(Integer id, String pass, String phone, String money) {
		return userDao.updateUser(id, pass, phone, money);
	}
	
	/**
	 * 根据id查询用户
	 */
	@Override
	public MyUserInfo queryUserById(Integer id) {
		return userDao.queryUserById(id);
	}

	@Override
	public MyUserInfo queryUserByPhone(String insurePhone) {
		return userDao.queryUserByPhone(insurePhone);
	}

	@Override
	public void changeMoneyById(String priceStr, Integer id) {
		userDao.changeMoneyById(priceStr,id);
	}


}
