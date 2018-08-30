package com.yidu.base.allEntity;

import java.util.Date;

public class Comicoreview {
    private Integer crId;

    private Integer userId;

    private String crText;

    private String state;

    private Integer praises;

    private Integer reply;

    private Date startTime;

    private Date endTime;

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCrText() {
        return crText;
    }

    public void setCrText(String crText) {
        this.crText = crText == null ? null : crText.trim();
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
        sb.append(", crId=").append(crId);
        sb.append(", userId=").append(userId);
        sb.append(", crText=").append(crText);
        sb.append(", state=").append(state);
        sb.append(", praises=").append(praises);
        sb.append(", reply=").append(reply);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}