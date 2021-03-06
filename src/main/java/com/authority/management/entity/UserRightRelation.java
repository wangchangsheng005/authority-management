package com.authority.management.entity;

import java.util.Date;

public class UserRightRelation {
    private Long id;

    private Long userId;

    private Long rightId;

    private String rightType;

    private Integer deleteStatus;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRightId() {
        return rightId;
    }

    public void setRightId(Long rightId) {
        this.rightId = rightId;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType == null ? null : rightType.trim();
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}