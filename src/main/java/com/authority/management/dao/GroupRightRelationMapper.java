package com.authority.management.dao;

import com.authority.management.entity.GroupRightRelation;

public interface GroupRightRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GroupRightRelation record);

    int insertSelective(GroupRightRelation record);

    GroupRightRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GroupRightRelation record);

    int updateByPrimaryKey(GroupRightRelation record);
}