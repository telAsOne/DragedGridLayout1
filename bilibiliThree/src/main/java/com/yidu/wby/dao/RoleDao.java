package com.yidu.wby.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yidu.wby.entity.Role;

/**
 * 角色接口类
 * @author wby
 * 2018年7月19日
 */
@Repository
public interface RoleDao {
	/**
	 * 查询所有角色
	 * @param role 角色
	 * @return 角色集合
	 */
	public List<Role> getAllRole(Role role);
}
