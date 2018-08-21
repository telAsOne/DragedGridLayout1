package com.yidu.base.allEntity;

import java.util.Date;

public class UserChat {
    private Integer userchatId;

    private Integer chatUsera;

    private Integer chatUserb;

    private Date statrTime;

    private String useraLook;

    private String userbLook;

    public Integer getUserchatId() {
        return userchatId;
    }

    public void setUserchatId(Integer userchatId) {
        this.userchatId = userchatId;
    }

    public Integer getChatUsera() {
        return chatUsera;
    }

    public void setChatUsera(Integer chatUsera) {
        this.chatUsera = chatUsera;
    }

    public Integer getChatUserb() {
        return chatUserb;
    }

    public void setChatUserb(Integer chatUserb) {
        this.chatUserb = chatUserb;
    }

    public Date getStatrTime() {
        return statrTime;
    }

    public void setStatrTime(Date statrTime) {
        this.statrTime = statrTime;
    }

    public String getUseraLook() {
        return useraLook;
    }

    public void setUseraLook(String useraLook) {
        this.useraLook = useraLook == null ? null : useraLook.trim();
    }

    public String getUserbLook() {
        return userbLook;
    }

    public void setUserbLook(String userbLook) {
        this.userbLook = userbLook == null ? null : userbLook.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userchatId=").append(userchatId);
        sb.append(", chatUsera=").append(chatUsera);
        sb.append(", chatUserb=").append(chatUserb);
        sb.append(", statrTime=").append(statrTime);
        sb.append(", useraLook=").append(useraLook);
        sb.append(", userbLook=").append(userbLook);
        sb.append("]");
        return sb.toString();
    }
}