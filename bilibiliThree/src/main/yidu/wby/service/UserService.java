package com.yidu.wby.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yidu.wby.entity.Role;
import com.yidu.wby.entity.User;

/**
 * 用户逻辑层
 * @author wby
 * 2018年7月12日
 */
public interface UserService {
	/**
	 * 查询所有后台用户
	 * @param admin 用户
	 * @return 后台用户集合
	 */
	public List<User> getAllUser(User user);
	
	/**
	 * 新增用户
	 * @param user 用户
	 * @return 返回参数
	 */
	public int addUser(User user);
	
	/**
	 * 查询角色用于新增
	 * @param role 角色
	 * @return 角色集合
	 */
	public List<Role> getRoleList(Role role);
	
	/**
	 * 新增用户角色表
	 * @param adminId 用户ID
	 * @param roleId 角色ID
	 */
	public void addAdminRole(@Param(value="roleId") int roleId,@Param(value="adminId") int adminId);
	
	/**
	 * 根据用户ID查询绝色名称
	 * @param adminId
	 * @return
	 */
	public String getRoleName(int adminId);
	
	/**
	 * 根据用户ID修改用户信息
	 * @param adminId 用户ID
	 * @return 修改是否成功
	 */
	public int updateUserById(User user);
	
	/**
	 * 根据用户ID修改用户角色信息
	 * @param adminId 用户ID
	 * @return 修改是否成功
	 */
	public int updateAdminRoleById(User user);
	
}
