package com.yidu.base.allEntity;

import java.util.Date;

public class Extension extends Video{
    private Integer id;

    private Integer videoId;

    private Date startTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
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
        sb.append(", videoId=").append(videoId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", videoName=").append(videoName);
        sb.append(", videoImage=").append(videoImage);
        sb.append(", videoInfo=").append(videoInfo);
        sb.append(", videoUpofuser=").append(videoUpofuser);
        sb.append(", videoUptime=").append(videoUptime);
        sb.append(", playsum=").append(playsum);
        sb.append(", collectsum=").append(collectsum);
        sb.append(", supportsum=").append(supportsum);
        sb.append(", comentsum=").append(comentsum);
        sb.append("]");
        return sb.toString();
    }
}