package com.yidu.zch.entity;

/**
 * 创作中心菜单实体类
 * @author 朱辞涵
 * @date 2018年7月18日
 */
public class CreateMenu {
	
	private int createId;
	private String createName;
	private String url;
	private String topId;
	private String state;
	
	public int getCreateId() {
		return createId;
	}
	public void setCreateId(int createId) {
		this.createId = createId;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTopId() {
		return topId;
	}
	public void setTopId(String topId) {
		this.topId = topId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "CreateMenu [createId=" + createId + ", createName="
				+ createName + ", url=" + url + ", topId=" + topId + ", state="
				+ state + "]";
	}
}

