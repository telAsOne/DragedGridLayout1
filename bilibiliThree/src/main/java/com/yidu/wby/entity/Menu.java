package com.yidu.wby.entity;
/**
 * 菜单实体类
 * @author wby
 * 2018年7月12日
 */
public class Menu {
	private int menuId;
	private String text;
	private String state;
	private String url;
	private int pid;
	private String iconCls;
	private int adminId;
	
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", text=" + text + ", state=" + state
				+ ", url=" + url + ", pid=" + pid + ", iconCls=" + iconCls
				+ "]";
	}
	
	
}
