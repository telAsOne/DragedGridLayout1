package com.yidu.base.allEntity;

import java.util.Date;

public class UserInfo {
	
    private Integer userId;   // ID
    private String userName;  // 用户名
    private String userPsw;   // 密码
    private String sex;       // 性别，直接存储 男 女
    private String phone;     // 电话号码
    private Integer userLevel;    // 会员等级
    private Integer integral; // 积分
    private String email;     // 邮件
    private String nickname;  // 昵称
    private Date startTime;   // 创建时间  即注册时间
    private Date endLoginTime;// 最后一次登录时间
    private Date endTime;     // 最后一次修改时间
    private String headPortrait; // 头像 是个url
    private String comments;  // 签名档
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPsw() {
		return userPsw;
	}
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndLoginTime() {
		return endLoginTime;
	}
	public void setEndLoginTime(Date endLoginTime) {
		this.endLoginTime = endLoginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public UserInfo(Integer userId, String userName, String userPsw,
			String sex, String phone, Integer userLevel, Integer integral,
			String email, String nickname, Date startTime, Date endLoginTime,
			Date endTime, String headPortrait, String comments) {
		this.userId = userId;
		this.userName = userName;
		this.userPsw = userPsw;
		this.sex = sex;
		this.phone = phone;
		this.userLevel = userLevel;
		this.integral = integral;
		this.email = email;
		this.nickname = nickname;
		this.startTime = startTime;
		this.endLoginTime = endLoginTime;
		this.endTime = endTime;
		this.headPortrait = headPortrait;
		this.comments = comments;
	}
	
	public UserInfo() {
	}
	
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", userPsw=" + userPsw + ", sex=" + sex + ", phone=" + phone
				+ ", userLevel=" + userLevel + ", integral=" + integral
				+ ", email=" + email + ", nickname=" + nickname
				+ ", startTime=" + startTime + ", endLoginTime=" + endLoginTime
				+ ", endTime=" + endTime + ", headPortrait=" + headPortrait
				+ ", comments=" + comments + "]";
	}
    
}