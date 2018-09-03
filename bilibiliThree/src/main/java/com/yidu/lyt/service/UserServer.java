package com.yidu.lyt.service;


import com.yidu.base.allEntity.UserInfo;

public interface UserServer {

	/**
	 *新增用户
	 * @param user 用户
	 */
	public void increaseUser(UserInfo user);
	
	/**
	 * 查询用户
	 * @param user 用户
	 * @return
	 */
	public int selectUser(String userName);
	
	/**
	 * 根据用户名查询用户信息
	 * @param userPhone
	 * @return
	 */
	public UserInfo selectListUser(String phone);
	
	/**
	 * 判断手机号是否存在
	 * @param userPhone 手机号
	 * @return
	 */
	public int isPhoneExist(String phone);
	
}
