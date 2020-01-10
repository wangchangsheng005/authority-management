package com.authority.management.dao;

import com.authority.management.entity.RoleRightRelation;

public interface RoleRightRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleRightRelation record);

    int insertSelective(RoleRightRelation record);

    RoleRightRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleRightRelation record);

    int updateByPrimaryKey(RoleRightRelation record);
}