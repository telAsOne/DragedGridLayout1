package com.yidu.zch.entity;
/**
 * 视频信息实体类
 * @author Z
 *
 */
public class Video {
	
	//编号
	private int videoId;
	//视频名
	private String videoName;
	//视频封面图
	private String videoImage;
	//视频分区
	private String videoDistrict;
	//视频标签
	private String videoTag;
	//视频类型
	private String videoType;
	//视频状态
	private Integer videoState;
	//视频简介
	private String videoInfo;
	//上传者ID
	private int videoUpOfUser;
	//上传日期
	private String videoUpTime;
	//播放次数
	private int playSum;
	//收藏次数
	private int collectSum;
	//获赞数
	private int supportSum;
	//评论次数
	private int comentSum;
	
	public Video() {
		super();
	}

	public Video(int videoId, String videoName, String videoImage,
			String videoDistrict, String videoTag, String videoType,
			Integer videoState, String videoInfo, int videoUpOfUser,
			String videoUpTime, int playSum, int collectSum, int supportSum,
			int comentSum) {
		super();
		this.videoId = videoId;
		this.videoName = videoName;
		this.videoImage = videoImage;
		this.videoDistrict = videoDistrict;
		this.videoTag = videoTag;
		this.videoType = videoType;
		this.videoState = videoState;
		this.videoInfo = videoInfo;
		this.videoUpOfUser = videoUpOfUser;
		this.videoUpTime = videoUpTime;
		this.playSum = playSum;
		this.collectSum = collectSum;
		this.supportSum = supportSum;
		this.comentSum = comentSum;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoImage() {
		return videoImage;
	}

	public void setVideoImage(String videoImage) {
		this.videoImage = videoImage;
	}

	public String getVideoDistrict() {
		return videoDistrict;
	}

	public void setVideoDistrict(String videoDistrict) {
		this.videoDistrict = videoDistrict;
	}

	public String getVideoTag() {
		return videoTag;
	}

	public void setVideoTag(String videoTag) {
		this.videoTag = videoTag;
	}

	public String getVideoType() {
		return videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

	public Integer getVideoState() {
		return videoState;
	}

	public void setVideoState(Integer videoState) {
		this.videoState = videoState;
	}

	public String getVideoInfo() {
		return videoInfo;
	}

	public void setVideoInfo(String videoInfo) {
		this.videoInfo = videoInfo;
	}

	public int getVideoUpOfUser() {
		return videoUpOfUser;
	}

	public void setVideoUpOfUser(int videoUpOfUser) {
		this.videoUpOfUser = videoUpOfUser;
	}

	public String getVideoUpTime() {
		return videoUpTime;
	}

	public void setVideoUpTime(String videoUpTime) {
		this.videoUpTime = videoUpTime;
	}

	public int getPlaySum() {
		return playSum;
	}

	public void setPlaySum(int playSum) {
		this.playSum = playSum;
	}

	public int getCollectSum() {
		return collectSum;
	}

	public void setCollectSum(int collectSum) {
		this.collectSum = collectSum;
	}

	public int getSupportSum() {
		return supportSum;
	}

	public void setSupportSum(int supportSum) {
		this.supportSum = supportSum;
	}

	public int getComentSum() {
		return comentSum;
	}

	public void setComentSum(int comentSum) {
		this.comentSum = comentSum;
	}

	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", videoName=" + videoName
				+ ", videoImage=" + videoImage + ", videoDistrict="
				+ videoDistrict + ", videoTag=" + videoTag + ", videoType="
				+ videoType + ", videoState=" + videoState + ", videoInfo="
				+ videoInfo + ", videoUpOfUser=" + videoUpOfUser
				+ ", videoUpTime=" + videoUpTime + ", playSum=" + playSum
				+ ", collectSum=" + collectSum + ", supportSum=" + supportSum
				+ ", comentSum=" + comentSum + "]";
	}
	
}
