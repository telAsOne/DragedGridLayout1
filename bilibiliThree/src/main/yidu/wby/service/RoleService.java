package com.yidu.wby.service;

import java.util.List;

import com.yidu.wby.entity.Role;


/**
 * 角色逻辑层接口
 * @author wby
 * 2018年7月19日
 */
public interface RoleService {
	/**
	 * 查询所有角色
	 * @param role 角色
	 * @return 角色集合
	 */
	public List<Role> getAllRole(Role role);
}
