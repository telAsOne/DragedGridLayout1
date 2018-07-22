package com.yidu.base.allEntity;

import java.util.Date;

public class UserInfo {
    private Integer userId;

    private String userName;

    private String uerPsw;

    private String sex;

    private Integer phone;

    private Integer level;

    private Integer integral;

    private String email;

    private String nickname;

    private Date startTime;

    private Date endLoginTime;

    private Date endTime;

    private String headPortrait;

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

    public String getUerPsw() {
        return uerPsw;
    }

    public void setUerPsw(String uerPsw) {
        this.uerPsw = uerPsw == null ? null : uerPsw.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", uerPsw=").append(uerPsw);
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
        sb.append("]");
        return sb.toString();
    }
}