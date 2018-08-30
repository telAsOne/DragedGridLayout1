package com.yidu.base.allEntity;

import java.util.Date;

public class Draft {
    private Integer draftId;

    private Integer id;

    private String draftImg;

    private String draftTitle;

    private String draftContent;

    private String draftLabel;

    private Date startTime;

    private Date endTime;

    public Integer getDraftId() {
        return draftId;
    }

    public void setDraftId(Integer draftId) {
        this.draftId = draftId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDraftImg() {
        return draftImg;
    }

    public void setDraftImg(String draftImg) {
        this.draftImg = draftImg == null ? null : draftImg.trim();
    }

    public String getDraftTitle() {
        return draftTitle;
    }

    public void setDraftTitle(String draftTitle) {
        this.draftTitle = draftTitle == null ? null : draftTitle.trim();
    }

    public String getDraftContent() {
        return draftContent;
    }

    public void setDraftContent(String draftContent) {
        this.draftContent = draftContent == null ? null : draftContent.trim();
    }

    public String getDraftLabel() {
        return draftLabel;
    }

    public void setDraftLabel(String draftLabel) {
        this.draftLabel = draftLabel == null ? null : draftLabel.trim();
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
        sb.append(", draftId=").append(draftId);
        sb.append(", id=").append(id);
        sb.append(", draftImg=").append(draftImg);
        sb.append(", draftTitle=").append(draftTitle);
        sb.append(", draftContent=").append(draftContent);
        sb.append(", draftLabel=").append(draftLabel);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}