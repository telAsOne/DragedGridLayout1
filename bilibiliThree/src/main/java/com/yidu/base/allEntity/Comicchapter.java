package com.yidu.base.allEntity;

import java.util.Date;

public class Comicchapter {
    private Integer ccId;

    private Integer chapter;

    private Integer comicId;

    private String cartoonPictures;

    private Date startTime;

    private Date endTime;

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getComicId() {
        return comicId;
    }

    public void setComicId(Integer comicId) {
        this.comicId = comicId;
    }

    public String getCartoonPictures() {
        return cartoonPictures;
    }

    public void setCartoonPictures(String cartoonPictures) {
        this.cartoonPictures = cartoonPictures == null ? null : cartoonPictures.trim();
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
        sb.append(", ccId=").append(ccId);
        sb.append(", chapter=").append(chapter);
        sb.append(", comicId=").append(comicId);
        sb.append(", cartoonPictures=").append(cartoonPictures);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}