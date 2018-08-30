package com.yidu.base.allEntity;

import java.util.Date;

public class Review {
    private Integer reviewId;

    private Integer useraId;

    private String reviewText;

    private String reviewcontenturl;

    private String state;

    private Integer praises;

    private Integer reply;

    private Integer reviewstate;

    private Date startTime;

    private Date endTime;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getUseraId() {
        return useraId;
    }

    public void setUseraId(Integer useraId) {
        this.useraId = useraId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText == null ? null : reviewText.trim();
    }

    public String getReviewcontenturl() {
        return reviewcontenturl;
    }

    public void setReviewcontenturl(String reviewcontenturl) {
        this.reviewcontenturl = reviewcontenturl == null ? null : reviewcontenturl.trim();
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

    public Integer getReviewstate() {
        return reviewstate;
    }

    public void setReviewstate(Integer reviewstate) {
        this.reviewstate = reviewstate;
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
        sb.append(", reviewId=").append(reviewId);
        sb.append(", useraId=").append(useraId);
        sb.append(", reviewText=").append(reviewText);
        sb.append(", reviewcontenturl=").append(reviewcontenturl);
        sb.append(", state=").append(state);
        sb.append(", praises=").append(praises);
        sb.append(", reply=").append(reply);
        sb.append(", reviewstate=").append(reviewstate);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}