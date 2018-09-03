package com.yidu.lyt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.UserInfo;
import com.yidu.base.allMapper.UserInfoMapper;
import com.yidu.lyt.dao.CustomerDao;
import com.yidu.lyt.service.UserServer;

@Service("userServerImpl")
public class UserServerImpl implements UserServer{

	/**
	 * 自动注入
	 */
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	
	/**
	 * 新增用户
	 */
	public void increaseUser(UserInfo user) {
		
		userInfoMapper.insert(user);
	}

	/**
	 * 查询用户
	 */
	public int selectUser(String userName) {
		
		int selectUser = customerDao.selectUser(userName);
		return selectUser;
	}

	/**
	 * 根据用户名查询用户信息
	 */
	@Override
	public UserInfo selectListUser(String phone) {
		
		UserInfo selectListUser = customerDao.selectListUser(phone);
		return selectListUser;
	}

	/**
	 * 判断手机号是否存在
	 */
	@Override
	public int isPhoneExist(String phone) {
		
		int phoneExist = customerDao.isPhoneExist(phone);
		return phoneExist;
	}

}
