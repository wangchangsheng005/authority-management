package com.authority.management.dao;

import com.authority.management.entity.UserGroupRelation;

public interface UserGroupRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserGroupRelation record);

    int insertSelective(UserGroupRelation record);

    UserGroupRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserGroupRelation record);

    int updateByPrimaryKey(UserGroupRelation record);
}