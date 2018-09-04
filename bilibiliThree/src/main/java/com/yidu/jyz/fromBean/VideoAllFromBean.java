package com.yidu.jyz.fromBean;

import java.util.List;

public class VideoAllFromBean{
	private String imgUrl;
	
	private Integer vlId;

	private Integer vlPid;

	private String vlName;
	
	private String islookhome;

	private String homename;
	
	private String icon;

	private String idUi;

	private List<VideoFormBean> news;
	
	private List<VideoFormBean> latestPosts;
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIdUi() {
		return idUi;
	}
	public void setIdUi(String idUi) {
		this.idUi = idUi;
	}
	
	public Integer getVlId() {
		return vlId;
	}
	public void setVlId(Integer vlId) {
		this.vlId = vlId;
	}
	public Integer getVlPid() {
		return vlPid;
	}
	public void setVlPid(Integer vlPid) {
		this.vlPid = vlPid;
	}
	public String getVlName() {
		return vlName;
	}
	public void setVlName(String vlName) {
		this.vlName = vlName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public String getIslookhome() {
		return islookhome;
	}
	
	public void setIslookhome(String islookhome) {
		this.islookhome = islookhome;
	}
	public String getHomename() {
		return homename;
	}
	public void setHomename(String homename) {
		this.homename = homename;
	}
	
	public List<VideoFormBean> getNews() {
		return news;
	}
	public void setNews(List<VideoFormBean> news) {
		this.news = news;
	}
	public List<VideoFormBean> getLatestPosts() {
		return latestPosts;
	}
	public void setLatestPosts(List<VideoFormBean> latestPosts) {
		this.latestPosts = latestPosts;
	}
	@Override
	public String toString() {
		return "VideoAllFromBean [imgUrl=" + imgUrl + ", vlId=" + vlId
				+ ", vlPid=" + vlPid + ", vlName=" + vlName + ", islookhome="
				+ islookhome + ", homename=" + homename + ", icon=" + icon
				+ ", idUi=" + idUi + ", news=" + news + ", latestPosts="
				+ latestPosts + "]";
	}
}
