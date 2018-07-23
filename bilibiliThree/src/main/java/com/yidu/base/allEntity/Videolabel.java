package com.yidu.base.allEntity;

import java.util.Date;

public class Videolabel {
    private Integer vlId;

    private String vlName;

    private Date startTime;

    private Date endTime;

    public Integer getVlId() {
        return vlId;
    }

    public void setVlId(Integer vlId) {
        this.vlId = vlId;
    }

    public String getVlName() {
        return vlName;
    }

    public void setVlName(String vlName) {
        this.vlName = vlName == null ? null : vlName.trim();
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
        sb.append(", vlId=").append(vlId);
        sb.append(", vlName=").append(vlName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}