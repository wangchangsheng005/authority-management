package com.authority.management.dao;

import com.authority.management.entity.UserRightRelation;

public interface UserRightRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRightRelation record);

    int insertSelective(UserRightRelation record);

    UserRightRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRightRelation record);

    int updateByPrimaryKey(UserRightRelation record);
}