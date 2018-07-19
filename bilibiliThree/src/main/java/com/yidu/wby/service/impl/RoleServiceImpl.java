package com.yidu.wby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.wby.dao.RoleDao;
import com.yidu.wby.entity.Role;
import com.yidu.wby.service.RoleService;

/**
 * 角色逻辑层实现类
 * @author wby
 * 2018年7月19日
 */
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleDao dao;
	
	public List<Role> getAllRole(Role role) {
		List<Role> allRole = dao.getAllRole(role);
		return allRole;
	}

}
