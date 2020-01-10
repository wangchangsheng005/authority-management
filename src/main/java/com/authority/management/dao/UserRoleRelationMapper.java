package com.authority.management.dao;

import com.authority.management.entity.UserRoleRelation;

public interface UserRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelation record);

    int insertSelective(UserRoleRelation record);

    UserRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoleRelation record);

    int updateByPrimaryKey(UserRoleRelation record);
}