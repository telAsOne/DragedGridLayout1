package com.yidu.base.allEntity;

import java.util.Date;

public class Columns {
    private Integer columnId;

    private Integer userId;

    private String columnTitle;

    private String columnContentAddress;

    private String columnType;

    private String columnClassification;

    private Integer favoritesClassification;

    private String columnWhetherforwarded;

    private String audit;

    private String label;

    private Integer readingNumber;

    private Integer commentsNumber;

    private Integer likeNumber;

    private Integer collectionNumber;

    private Date startTime;

    private Date endTime;

    private String columnImgtitle;

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle == null ? null : columnTitle.trim();
    }

    public String getColumnContentAddress() {
        return columnContentAddress;
    }

    public void setColumnContentAddress(String columnContentAddress) {
        this.columnContentAddress = columnContentAddress == null ? null : columnContentAddress.trim();
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    public String getColumnClassification() {
        return columnClassification;
    }

    public void setColumnClassification(String columnClassification) {
        this.columnClassification = columnClassification == null ? null : columnClassification.trim();
    }

    public Integer getFavoritesClassification() {
        return favoritesClassification;
    }

    public void setFavoritesClassification(Integer favoritesClassification) {
        this.favoritesClassification = favoritesClassification;
    }

    public String getColumnWhetherforwarded() {
        return columnWhetherforwarded;
    }

    public void setColumnWhetherforwarded(String columnWhetherforwarded) {
        this.columnWhetherforwarded = columnWhetherforwarded == null ? null : columnWhetherforwarded.trim();
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit == null ? null : audit.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getReadingNumber() {
        return readingNumber;
    }

    public void setReadingNumber(Integer readingNumber) {
        this.readingNumber = readingNumber;
    }

    public Integer getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(Integer commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Integer getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(Integer collectionNumber) {
        this.collectionNumber = collectionNumber;
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

    public String getColumnImgtitle() {
        return columnImgtitle;
    }

    public void setColumnImgtitle(String columnImgtitle) {
        this.columnImgtitle = columnImgtitle == null ? null : columnImgtitle.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", columnId=").append(columnId);
        sb.append(", userId=").append(userId);
        sb.append(", columnTitle=").append(columnTitle);
        sb.append(", columnContentAddress=").append(columnContentAddress);
        sb.append(", columnType=").append(columnType);
        sb.append(", columnClassification=").append(columnClassification);
        sb.append(", favoritesClassification=").append(favoritesClassification);
        sb.append(", columnWhetherforwarded=").append(columnWhetherforwarded);
        sb.append(", audit=").append(audit);
        sb.append(", label=").append(label);
        sb.append(", readingNumber=").append(readingNumber);
        sb.append(", commentsNumber=").append(commentsNumber);
        sb.append(", likeNumber=").append(likeNumber);
        sb.append(", collectionNumber=").append(collectionNumber);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", columnImgtitle=").append(columnImgtitle);
        sb.append("]");
        return sb.toString();
    }
}