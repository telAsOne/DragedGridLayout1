package com.yidu.base.allEntity;

import java.util.Date;

public class Daily {
    private Integer dailyId;

    private Integer dailyUserId;

    private Integer dailyCommentsId;

    private String dailyImgaddress;

    private String dailyWhetherforwarded;

    private Integer dailyPraisenumber;

    private Integer dailyBrowseNumber;

    private Integer dailyCollectionNumber;

    private String label;

    private String dailyAudit;

    private Integer favoritesClassification;

    private Date startTime;

    private Date endTime;

    private String dailyContent;

    public Integer getDailyId() {
        return dailyId;
    }

    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }

    public Integer getDailyUserId() {
        return dailyUserId;
    }

    public void setDailyUserId(Integer dailyUserId) {
        this.dailyUserId = dailyUserId;
    }

    public Integer getDailyCommentsId() {
        return dailyCommentsId;
    }

    public void setDailyCommentsId(Integer dailyCommentsId) {
        this.dailyCommentsId = dailyCommentsId;
    }

    public String getDailyImgaddress() {
        return dailyImgaddress;
    }

    public void setDailyImgaddress(String dailyImgaddress) {
        this.dailyImgaddress = dailyImgaddress == null ? null : dailyImgaddress.trim();
    }

    public String getDailyWhetherforwarded() {
        return dailyWhetherforwarded;
    }

    public void setDailyWhetherforwarded(String dailyWhetherforwarded) {
        this.dailyWhetherforwarded = dailyWhetherforwarded == null ? null : dailyWhetherforwarded.trim();
    }

    public Integer getDailyPraisenumber() {
        return dailyPraisenumber;
    }

    public void setDailyPraisenumber(Integer dailyPraisenumber) {
        this.dailyPraisenumber = dailyPraisenumber;
    }

    public Integer getDailyBrowseNumber() {
        return dailyBrowseNumber;
    }

    public void setDailyBrowseNumber(Integer dailyBrowseNumber) {
        this.dailyBrowseNumber = dailyBrowseNumber;
    }

    public Integer getDailyCollectionNumber() {
        return dailyCollectionNumber;
    }

    public void setDailyCollectionNumber(Integer dailyCollectionNumber) {
        this.dailyCollectionNumber = dailyCollectionNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getDailyAudit() {
        return dailyAudit;
    }

    public void setDailyAudit(String dailyAudit) {
        this.dailyAudit = dailyAudit == null ? null : dailyAudit.trim();
    }

    public Integer getFavoritesClassification() {
        return favoritesClassification;
    }

    public void setFavoritesClassification(Integer favoritesClassification) {
        this.favoritesClassification = favoritesClassification;
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

    public String getDailyContent() {
        return dailyContent;
    }

    public void setDailyContent(String dailyContent) {
        this.dailyContent = dailyContent == null ? null : dailyContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dailyId=").append(dailyId);
        sb.append(", dailyUserId=").append(dailyUserId);
        sb.append(", dailyCommentsId=").append(dailyCommentsId);
        sb.append(", dailyImgaddress=").append(dailyImgaddress);
        sb.append(", dailyWhetherforwarded=").append(dailyWhetherforwarded);
        sb.append(", dailyPraisenumber=").append(dailyPraisenumber);
        sb.append(", dailyBrowseNumber=").append(dailyBrowseNumber);
        sb.append(", dailyCollectionNumber=").append(dailyCollectionNumber);
        sb.append(", label=").append(label);
        sb.append(", dailyAudit=").append(dailyAudit);
        sb.append(", favoritesClassification=").append(favoritesClassification);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", dailyContent=").append(dailyContent);
        sb.append("]");
        return sb.toString();
    }
}