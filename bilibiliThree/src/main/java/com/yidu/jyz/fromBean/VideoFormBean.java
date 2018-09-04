package com.yidu.jyz.fromBean;

import com.yidu.base.allEntity.UserInfo;

import com.yidu.base.allEntity.Video;
import com.yidu.base.allEntity.Videolabel;
import com.yidu.base.allEntity.Videoorlabel;

public class VideoFormBean {
	@Override
	public String toString() {
		return "VideoFormBean [video=" + video + ", userInfo=" + userInfo
				+ ", videoorlabel=" + videoorlabel + ", videolabel="
				+ videolabel + "]";
	}

	private Video video;
	
	private UserInfo userInfo;
	
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Videoorlabel getVideoorlabel() {
		return videoorlabel;
	}

	public void setVideoorlabel(Videoorlabel videoorlabel) {
		this.videoorlabel = videoorlabel;
	}

	public Videolabel getVideolabel() {
		return videolabel;
	}

	public void setVideolabel(Videolabel videolabel) {
		this.videolabel = videolabel;
	}

	private Videoorlabel videoorlabel;
	
	private Videolabel videolabel;
}
