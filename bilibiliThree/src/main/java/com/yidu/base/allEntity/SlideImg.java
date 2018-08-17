package com.yidu.base.allEntity;

import java.util.Date;

public class SlideImg {
    private Integer slideId;

    private String slideTitle;

    private String slideContent;

    private Integer isshow;

    private String imageurl;

    private Integer isenabled;

    private Date startTime;

    private Date endTime;

    private String linkaddress;

    public Integer getSlideId() {
        return slideId;
    }

    public void setSlideId(Integer slideId) {
        this.slideId = slideId;
    }

    public String getSlideTitle() {
        return slideTitle;
    }

    public void setSlideTitle(String slideTitle) {
        this.slideTitle = slideTitle == null ? null : slideTitle.trim();
    }

    public String getSlideContent() {
        return slideContent;
    }

    public void setSlideContent(String slideContent) {
        this.slideContent = slideContent == null ? null : slideContent.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public Integer getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
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

    public String getLinkaddress() {
        return linkaddress;
    }

    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress == null ? null : linkaddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slideId=").append(slideId);
        sb.append(", slideTitle=").append(slideTitle);
        sb.append(", slideContent=").append(slideContent);
        sb.append(", isshow=").append(isshow);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", isenabled=").append(isenabled);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", linkaddress=").append(linkaddress);
        sb.append("]");
        return sb.toString();
    }
}