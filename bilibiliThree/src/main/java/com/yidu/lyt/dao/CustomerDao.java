package com.yidu.lyt.dao;

import org.springframework.stereotype.Repository;

import com.yidu.base.allEntity.UserInfo;


/**
 * Dao层
 * @author TING
 *
 */
@Repository
public interface CustomerDao {

	
	/**
	 * 查询用户
	 * @param user 用户
	 * @return
	 */
	public int selectUser(String userName);
	
	/**
	 * 根据用户名手机号用户信息
	 * @param userPhone 手机号
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