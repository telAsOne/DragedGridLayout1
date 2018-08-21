package com.yidu.base.allEntity;

public class IntegralRecord {
    private Integer id;

    private Integer userId;

    private String operationTime;

    private Integer integralState;

    private String integralDescribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime == null ? null : operationTime.trim();
    }

    public Integer getIntegralState() {
        return integralState;
    }

    public void setIntegralState(Integer integralState) {
        this.integralState = integralState;
    }

    public String getIntegralDescribe() {
        return integralDescribe;
    }

    public void setIntegralDescribe(String integralDescribe) {
        this.integralDescribe = integralDescribe == null ? null : integralDescribe.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", integralState=").append(integralState);
        sb.append(", integralDescribe=").append(integralDescribe);
        sb.append("]");
        return sb.toString();
    }
}