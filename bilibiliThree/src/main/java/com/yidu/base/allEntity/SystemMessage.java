package com.yidu.base.allEntity;

import java.util.Date;

public class SystemMessage {
    private Integer stmId;

    private String stmTitle;

    private String stmContent;

    private String stmSkipurl;

    private Date stmReleasetime;

    public Integer getStmId() {
        return stmId;
    }

    public void setStmId(Integer stmId) {
        this.stmId = stmId;
    }

    public String getStmTitle() {
        return stmTitle;
    }

    public void setStmTitle(String stmTitle) {
        this.stmTitle = stmTitle == null ? null : stmTitle.trim();
    }

    public String getStmContent() {
        return stmContent;
    }

    public void setStmContent(String stmContent) {
        this.stmContent = stmContent == null ? null : stmContent.trim();
    }

    public String getStmSkipurl() {
        return stmSkipurl;
    }

    public void setStmSkipurl(String stmSkipurl) {
        this.stmSkipurl = stmSkipurl == null ? null : stmSkipurl.trim();
    }

    public Date getStmReleasetime() {
        return stmReleasetime;
    }

    public void setStmReleasetime(Date stmReleasetime) {
        this.stmReleasetime = stmReleasetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stmId=").append(stmId);
        sb.append(", stmTitle=").append(stmTitle);
        sb.append(", stmContent=").append(stmContent);
        sb.append(", stmSkipurl=").append(stmSkipurl);
        sb.append(", stmReleasetime=").append(stmReleasetime);
        sb.append("]");
        return sb.toString();
    }
}