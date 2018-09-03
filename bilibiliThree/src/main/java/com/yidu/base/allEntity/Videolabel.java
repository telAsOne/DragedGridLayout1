package com.yidu.base.allEntity;

import java.util.Date;

public class Videolabel {
    private Integer vlId;

    private Integer vlPid;

    private String vlName;

    private String islookhome;

    private String homename;

    private Date startTime;

    private Date endTime;

    private String icon;

    public Integer getVlId() {
        return vlId;
    }

    public void setVlId(Integer vlId) {
        this.vlId = vlId;
    }

    public Integer getVlPid() {
        return vlPid;
    }

    public void setVlPid(Integer vlPid) {
        this.vlPid = vlPid;
    }

    public String getVlName() {
        return vlName;
    }

    public void setVlName(String vlName) {
        this.vlName = vlName == null ? null : vlName.trim();
    }

    public String getIslookhome() {
        return islookhome;
    }

    public void setIslookhome(String islookhome) {
        this.islookhome = islookhome == null ? null : islookhome.trim();
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename == null ? null : homename.trim();
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vlId=").append(vlId);
        sb.append(", vlPid=").append(vlPid);
        sb.append(", vlName=").append(vlName);
        sb.append(", islookhome=").append(islookhome);
        sb.append(", homename=").append(homename);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", icon=").append(icon);
        sb.append("]");
        return sb.toString();
    }
}