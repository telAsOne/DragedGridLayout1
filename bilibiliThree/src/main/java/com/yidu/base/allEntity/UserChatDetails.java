package com.yidu.base.allEntity;

import java.util.Date;

public class UserChatDetails {
    private Integer id;

    private Integer chatId;

    private String newsText;

    private Date statrTime;

    private Integer userSendMsgId;

    private Integer userMsgId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText == null ? null : newsText.trim();
    }

    public Date getStatrTime() {
        return statrTime;
    }

    public void setStatrTime(Date statrTime) {
        this.statrTime = statrTime;
    }

    public Integer getUserSendMsgId() {
        return userSendMsgId;
    }

    public void setUserSendMsgId(Integer userSendMsgId) {
        this.userSendMsgId = userSendMsgId;
    }

    public Integer getUserMsgId() {
        return userMsgId;
    }

    public void setUserMsgId(Integer userMsgId) {
        this.userMsgId = userMsgId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chatId=").append(chatId);
        sb.append(", newsText=").append(newsText);
        sb.append(", statrTime=").append(statrTime);
        sb.append(", userSendMsgId=").append(userSendMsgId);
        sb.append(", userMsgId=").append(userMsgId);
        sb.append("]");
        return sb.toString();
    }
}