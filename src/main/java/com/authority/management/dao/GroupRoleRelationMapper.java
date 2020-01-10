package com.authority.management.dao;

import com.authority.management.entity.GroupRoleRelation;

public interface GroupRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GroupRoleRelation record);

    int insertSelective(GroupRoleRelation record);

    GroupRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GroupRoleRelation record);

    int updateByPrimaryKey(GroupRoleRelation record);
}