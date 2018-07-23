package com.yidu.base.allEntity;

import java.util.Date;

public class Videoreview {
    private Integer vrId;

    private Integer userId;

    private String vrText;

    private String state;

    private Integer praises;

    private Integer reply;

    private Date startTime;

    private Date endTime;

    public Integer getVrId() {
        return vrId;
    }

    public void setVrId(Integer vrId) {
        this.vrId = vrId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVrText() {
        return vrText;
    }

    public void setVrText(String vrText) {
        this.vrText = vrText == null ? null : vrText.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getPraises() {
        return praises;
    }

    public void setPraises(Integer praises) {
        this.praises = praises;
    }

    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
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
        sb.append(", vrId=").append(vrId);
        sb.append(", userId=").append(userId);
        sb.append(", vrText=").append(vrText);
        sb.append(", state=").append(state);
        sb.append(", praises=").append(praises);
        sb.append(", reply=").append(reply);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}