package com.yidu.wby.entity;
/**
 * 用户实体类
 * @author wby
 * 2018年7月12日
 */
public class User {
	private int adminId;
	private String adminName;
	private String adminPsw;
	private String adminState;
	private int roleId;
	private String role;
	
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		if(adminName==null){
			return "";
		}
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPsw() {
		return adminPsw;
	}
	public void setAdminPsw(String adminPsw) {
		this.adminPsw = adminPsw;
	}
	public String getAdminState() {
		return adminState;
	}
	public void setAdminState(String adminState) {
		this.adminState = adminState;
	}
	@Override
	public String toString() {
		return "User [adminId=" + adminId + ", adminName=" + adminName
				+ ", adminPsw=" + adminPsw + ", adminState=" + adminState
				+ ", roleId=" + roleId + ", role=" + role + "]";
	}
	
	
	
	
}
