package com.yidu.base.allEntity;

import java.util.Date;

public class UserInfo {
	
    private Integer userId;   // ID
    private String userName;  // 用户名
    private String userPsw;   // 密码
    private String sex;       // 性别，直接存储 男 女
    private String phone;     // 电话号码
    private Integer level;    // 会员等级
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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
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
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPsw=").append(userPsw);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", level=").append(level);
        sb.append(", integral=").append(integral);
        sb.append(", email=").append(email);
        sb.append(", nickname=").append(nickname);
        sb.append(", startTime=").append(startTime);
        sb.append(", endLoginTime=").append(endLoginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", headPortrait=").append(headPortrait);
        sb.append(", comments=").append(comments);
        sb.append("]");
        return sb.toString();
    }
}