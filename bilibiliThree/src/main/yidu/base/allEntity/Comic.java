package com.yidu.base.allEntity;

import java.util.Date;

public class Comic {
    private Integer comicId;

    private String comicName;

    private String state;

    private Integer praises;

    private Integer chapter;

    private Date recently;

    private String information;

    private Integer readNumber;

    private Integer giftNumber;

    private Integer gift;

    private String portrait;

    private Date startTime;

    private Date endTime;

    public Integer getComicId() {
        return comicId;
    }

    public void setComicId(Integer comicId) {
        this.comicId = comicId;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName == null ? null : comicName.trim();
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

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Date getRecently() {
        return recently;
    }

    public void setRecently(Date recently) {
        this.recently = recently;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public Integer getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    public Integer getGiftNumber() {
        return giftNumber;
    }

    public void setGiftNumber(Integer giftNumber) {
        this.giftNumber = giftNumber;
    }

    public Integer getGift() {
        return gift;
    }

    public void setGift(Integer gift) {
        this.gift = gift;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
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
        sb.append(", comicId=").append(comicId);
        sb.append(", comicName=").append(comicName);
        sb.append(", state=").append(state);
        sb.append(", praises=").append(praises);
        sb.append(", chapter=").append(chapter);
        sb.append(", recently=").append(recently);
        sb.append(", information=").append(information);
        sb.append(", readNumber=").append(readNumber);
        sb.append(", giftNumber=").append(giftNumber);
        sb.append(", gift=").append(gift);
        sb.append(", portrait=").append(portrait);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}