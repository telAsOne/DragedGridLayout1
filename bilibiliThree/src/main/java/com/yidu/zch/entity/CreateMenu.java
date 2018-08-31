package com.yidu.zch.entity;

/**
 * 创作中心菜单实体类
 * @author 朱辞涵
 * @date 2018年7月18日
 */
public class CreateMenu {
	
	private int createId;
	private String createName;
	private String createUrl;
	private String createIcon;
	private String topId;
	private String state;
	
	public CreateMenu() {
		super();
	}
	
	public CreateMenu(int createId, String createName, String createUrl,
			String createIcon, String topId, String state) {
		super();
		this.createId = createId;
		this.createName = createName;
		this.createUrl = createUrl;
		this.createIcon = createIcon;
		this.topId = topId;
		this.state = state;
	}
	
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

	public String getCreateUrl() {
		return createUrl;
	}

	public void setCreateUrl(String createUrl) {
		this.createUrl = createUrl;
	}

	public String getCreateIcon() {
		return createIcon;
	}

	public void setCreateIcon(String createIcon) {
		this.createIcon = createIcon;
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
				+ createName + ", createUrl=" + createUrl + ", createIcon="
				+ createIcon + ", topId=" + topId + ", state=" + state + "]";
	}
	
}

