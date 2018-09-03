package com.yidu.base.allEntity;

public class Video {
    protected Integer videoId;

    protected String videoName;

    protected String videoImage;

    protected String videoInfo;

    protected Integer videoUpofuser;

    protected Integer videoUptime;

    protected String videoType;

    protected Integer videoState;

    protected Integer playsum;

    protected Integer collectsum;

    protected Integer supportsum;

    protected Integer comentsum;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage == null ? null : videoImage.trim();
    }

    public String getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo == null ? null : videoInfo.trim();
    }

    public Integer getVideoUpofuser() {
        return videoUpofuser;
    }

    public void setVideoUpofuser(Integer videoUpofuser) {
        this.videoUpofuser = videoUpofuser;
    }

    public Integer getVideoUptime() {
        return videoUptime;
    }

    public void setVideoUptime(Integer videoUptime) {
        this.videoUptime = videoUptime;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public Integer getVideoState() {
        return videoState;
    }

    public void setVideoState(Integer videoState) {
        this.videoState = videoState;
    }

    public Integer getPlaysum() {
        return playsum;
    }

    public void setPlaysum(Integer playsum) {
        this.playsum = playsum;
    }

    public Integer getCollectsum() {
        return collectsum;
    }

    public void setCollectsum(Integer collectsum) {
        this.collectsum = collectsum;
    }

    public Integer getSupportsum() {
        return supportsum;
    }

    public void setSupportsum(Integer supportsum) {
        this.supportsum = supportsum;
    }

    public Integer getComentsum() {
        return comentsum;
    }

    public void setComentsum(Integer comentsum) {
        this.comentsum = comentsum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", videoId=").append(videoId);
        sb.append(", videoName=").append(videoName);
        sb.append(", videoImage=").append(videoImage);
        sb.append(", videoInfo=").append(videoInfo);
        sb.append(", videoUpofuser=").append(videoUpofuser);
        sb.append(", videoUptime=").append(videoUptime);
        sb.append(", videoType=").append(videoType);
        sb.append(", videoState=").append(videoState);
        sb.append(", playsum=").append(playsum);
        sb.append(", collectsum=").append(collectsum);
        sb.append(", supportsum=").append(supportsum);
        sb.append(", comentsum=").append(comentsum);
        sb.append("]");
        return sb.toString();
    }
}