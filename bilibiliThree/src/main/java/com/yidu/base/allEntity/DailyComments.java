package com.yidu.base.allEntity;

import java.util.Date;

public class DailyComments {
    private Integer id;

    private Integer dailyId;

    private Integer userCommentsA;

    private Integer userCommentsB;

    private String content;

    private Date startTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDailyId() {
        return dailyId;
    }

    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }

    public Integer getUserCommentsA() {
        return userCommentsA;
    }

    public void setUserCommentsA(Integer userCommentsA) {
        this.userCommentsA = userCommentsA;
    }

    public Integer getUserCommentsB() {
        return userCommentsB;
    }

    public void setUserCommentsB(Integer userCommentsB) {
        this.userCommentsB = userCommentsB;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dailyId=").append(dailyId);
        sb.append(", userCommentsA=").append(userCommentsA);
        sb.append(", userCommentsB=").append(userCommentsB);
        sb.append(", content=").append(content);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}