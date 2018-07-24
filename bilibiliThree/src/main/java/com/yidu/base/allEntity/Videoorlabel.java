package com.yidu.base.allEntity;

import java.util.Date;

public class Videoorlabel {
    private Integer volId;

    private Integer videoId;

    private Integer vlId;

    private Date startTime;

    private Date endTime;

    public Integer getVolId() {
        return volId;
    }

    public void setVolId(Integer volId) {
        this.volId = volId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getVlId() {
        return vlId;
    }

    public void setVlId(Integer vlId) {
        this.vlId = vlId;
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
        sb.append(", volId=").append(volId);
        sb.append(", videoId=").append(videoId);
        sb.append(", vlId=").append(vlId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}