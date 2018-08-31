package com.yidu.base.allEntity;

import java.util.Date;
public class Draft {
	//草稿id
    private Integer draftId;
    //用户id
    private Integer userId;
    //图片二进制
    private String draftImg;
    //标题
    private String draftTitle;
    //草稿内容地址
    private String draftContentAddress;
    //类型
    private String draftType;
    //分类
    private String  draftClassification;
    //标签
    private String draftLabel;
   //创建时间
    private Date startTime;
    //最后更改时间
    private Date endTime;
	public Integer getDraftId() {
		return draftId;
	}
	public void setDraftId(Integer draftId) {
		this.draftId = draftId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getDraftImg() {
		return draftImg;
	}
	public void setDraftImg(String draftImg) {
		this.draftImg = draftImg;
	}
	public String getDraftTitle() {
		return draftTitle;
	}
	public void setDraftTitle(String draftTitle) {
		this.draftTitle = draftTitle;
	}
	public String getDraftContentAddress() {
		return draftContentAddress;
	}
	public void setDraftContentAddress(String draftContentAddress) {
		this.draftContentAddress = draftContentAddress;
	}
	public String getDraftType() {
		return draftType;
	}
	public void setDraftType(String draftType) {
		this.draftType = draftType;
	}
	public String getDraftClassification() {
		return draftClassification;
	}
	public void setDraftClassification(String draftClassification) {
		this.draftClassification = draftClassification;
	}
	public String getDraftLabel() {
		return draftLabel;
	}
	public void setDraftLabel(String draftLabel) {
		this.draftLabel = draftLabel;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Draft(Integer draftId, Integer userId, String draftImg,
			String draftTitle, String draftContentAddress, String draftType,
			String draftClassification, String draftLabel, Date startTime,
			Date endTime) {
		super();
		this.draftId = draftId;
		this.userId = userId;
		this.draftImg = draftImg;
		this.draftTitle = draftTitle;
		this.draftContentAddress = draftContentAddress;
		this.draftType = draftType;
		this.draftClassification = draftClassification;
		this.draftLabel = draftLabel;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Draft() {
		super();
	}
	@Override
	public String toString() {
		return "Draft [draftId=" + draftId + ", userId=" + userId
				+ ", draftImg=" + draftImg + ", draftTitle=" + draftTitle
				+ ", draftContentAddress=" + draftContentAddress
				+ ", draftType=" + draftType + ", draftClassification="
				+ draftClassification + ", draftLabel=" + draftLabel
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
}