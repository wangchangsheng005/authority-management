package com.authority.management.dao;

import java.util.List;

import com.authority.management.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    //查询所有角色信息
    List<Role> queryRoleInfoAll();
}