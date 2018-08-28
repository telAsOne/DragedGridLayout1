package com.yidu.base.allEntity;

import java.util.Date;

public class Painting {
    private Integer paintingId;

    private Integer paintingUserId;

    private Integer paintingCommentsId;

    private String paintingImgaddress;

    private String paintingWhetherforwarded;

    private Integer paintingPraisenumber;

    private Integer paintingCollectionNumber;

    private String paintingAttribute;

    private Integer paintingClassification;

    private Integer paintingBrowseNumber;

    private String paintingSourcelabelLabel;

    private String paintingOtherlabelLabel;

    private String paintingAudit;

    private Integer favoritesClassification;

    private Date startTime;

    private Date endTime;

    private String paintingContent;

    public Integer getPaintingId() {
        return paintingId;
    }

    public void setPaintingId(Integer paintingId) {
        this.paintingId = paintingId;
    }

    public Integer getPaintingUserId() {
        return paintingUserId;
    }

    public void setPaintingUserId(Integer paintingUserId) {
        this.paintingUserId = paintingUserId;
    }

    public Integer getPaintingCommentsId() {
        return paintingCommentsId;
    }

    public void setPaintingCommentsId(Integer paintingCommentsId) {
        this.paintingCommentsId = paintingCommentsId;
    }

    public String getPaintingImgaddress() {
        return paintingImgaddress;
    }

    public void setPaintingImgaddress(String paintingImgaddress) {
        this.paintingImgaddress = paintingImgaddress == null ? null : paintingImgaddress.trim();
    }

    public String getPaintingWhetherforwarded() {
        return paintingWhetherforwarded;
    }

    public void setPaintingWhetherforwarded(String paintingWhetherforwarded) {
        this.paintingWhetherforwarded = paintingWhetherforwarded == null ? null : paintingWhetherforwarded.trim();
    }

    public Integer getPaintingPraisenumber() {
        return paintingPraisenumber;
    }

    public void setPaintingPraisenumber(Integer paintingPraisenumber) {
        this.paintingPraisenumber = paintingPraisenumber;
    }

    public Integer getPaintingCollectionNumber() {
        return paintingCollectionNumber;
    }

    public void setPaintingCollectionNumber(Integer paintingCollectionNumber) {
        this.paintingCollectionNumber = paintingCollectionNumber;
    }

    public String getPaintingAttribute() {
        return paintingAttribute;
    }

    public void setPaintingAttribute(String paintingAttribute) {
        this.paintingAttribute = paintingAttribute == null ? null : paintingAttribute.trim();
    }

    public Integer getPaintingClassification() {
        return paintingClassification;
    }

    public void setPaintingClassification(Integer paintingClassification) {
        this.paintingClassification = paintingClassification;
    }

    public Integer getPaintingBrowseNumber() {
        return paintingBrowseNumber;
    }

    public void setPaintingBrowseNumber(Integer paintingBrowseNumber) {
        this.paintingBrowseNumber = paintingBrowseNumber;
    }

    public String getPaintingSourcelabelLabel() {
        return paintingSourcelabelLabel;
    }

    public void setPaintingSourcelabelLabel(String paintingSourcelabelLabel) {
        this.paintingSourcelabelLabel = paintingSourcelabelLabel == null ? null : paintingSourcelabelLabel.trim();
    }

    public String getPaintingOtherlabelLabel() {
        return paintingOtherlabelLabel;
    }

    public void setPaintingOtherlabelLabel(String paintingOtherlabelLabel) {
        this.paintingOtherlabelLabel = paintingOtherlabelLabel == null ? null : paintingOtherlabelLabel.trim();
    }

    public String getPaintingAudit() {
        return paintingAudit;
    }

    public void setPaintingAudit(String paintingAudit) {
        this.paintingAudit = paintingAudit == null ? null : paintingAudit.trim();
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

    public String getPaintingContent() {
        return paintingContent;
    }

    public void setPaintingContent(String paintingContent) {
        this.paintingContent = paintingContent == null ? null : paintingContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paintingId=").append(paintingId);
        sb.append(", paintingUserId=").append(paintingUserId);
        sb.append(", paintingCommentsId=").append(paintingCommentsId);
        sb.append(", paintingImgaddress=").append(paintingImgaddress);
        sb.append(", paintingWhetherforwarded=").append(paintingWhetherforwarded);
        sb.append(", paintingPraisenumber=").append(paintingPraisenumber);
        sb.append(", paintingCollectionNumber=").append(paintingCollectionNumber);
        sb.append(", paintingAttribute=").append(paintingAttribute);
        sb.append(", paintingClassification=").append(paintingClassification);
        sb.append(", paintingBrowseNumber=").append(paintingBrowseNumber);
        sb.append(", paintingSourcelabelLabel=").append(paintingSourcelabelLabel);
        sb.append(", paintingOtherlabelLabel=").append(paintingOtherlabelLabel);
        sb.append(", paintingAudit=").append(paintingAudit);
        sb.append(", favoritesClassification=").append(favoritesClassification);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", paintingContent=").append(paintingContent);
        sb.append("]");
        return sb.toString();
    }
}