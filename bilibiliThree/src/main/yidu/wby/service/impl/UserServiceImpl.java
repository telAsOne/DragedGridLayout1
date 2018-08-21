package com.yidu.wby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.wby.dao.UserDao;
import com.yidu.wby.entity.Role;
import com.yidu.wby.entity.User;
import com.yidu.wby.service.UserService;

import sun.print.resources.serviceui;

/**
 * 用户逻辑实现层
 * @author wby
 * 2018年7月12日
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;
	
	/**
	 * 查询所有用户
	 */
	public List<User> getAllUser(User user) {
		List<User> allUser = dao.getAllUser(user);
		return allUser;
	}
	
	/**
	 * 新增用户
	 */
	public int addUser(User user) {
		int addUser = dao.addUser(user);
		return addUser;
	}
	
	/**
	 * 查询角色
	 */
	public List<Role> getRoleList(Role role) {
		List<Role> roleList = dao.getRoleList(role);
		return roleList;
	}

	public void addAdminRole(int roleId, int adminId) {
		dao.addAdminRole(roleId, adminId);
	}

	public String getRoleName(int adminId) {
		String roleName = dao.getRoleName(adminId);
		return roleName;
	}

	public int updateUserById(User user) {
		int updateUserById = dao.updateUserById(user);
		return updateUserById;
	}

	public int updateAdminRoleById(User user) {
		int updateAdminRoleById = dao.updateAdminRoleById(user);
		return updateAdminRoleById;
	}



	

	
}
