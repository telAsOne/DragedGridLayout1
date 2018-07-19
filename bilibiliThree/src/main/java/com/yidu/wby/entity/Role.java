package com.yidu.wby.entity;
/**
 * 角色实体类
 * @author wby
 * 2018年7月19日
 */
public class Role {
	private int roleId;
	private String roleName;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		if(roleName==null){
			return "";
		}
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
	
}
