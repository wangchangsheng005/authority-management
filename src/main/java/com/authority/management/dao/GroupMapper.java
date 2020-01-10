package com.authority.management.dao;

import java.util.List;

import com.authority.management.entity.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
    
    //查询所有组信息
    List<Group> queryGroupInfoAll();
}