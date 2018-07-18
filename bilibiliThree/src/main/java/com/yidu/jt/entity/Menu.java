package com.yidu.jt.entity;

public class Menu {
	private Integer createId;
	private String createName;
	
	private String createUrl;
	
	private Integer createTopId;
	
	private String state;

	@Override
	public String toString() {
		return "Menu [createId=" + createId + ", createName=" + createName
				+ ", createUrl=" + createUrl + ", createTopId=" + createTopId
				+ ", state=" + state + "]";
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
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

	public Integer getCreateTopId() {
		return createTopId;
	}

	public void setCreateTopId(Integer createTopId) {
		this.createTopId = createTopId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
