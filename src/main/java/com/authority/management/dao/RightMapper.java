package com.authority.management.dao;

import java.util.List;

import com.authority.management.entity.Right;

public interface RightMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
    
    //查询所有权限信息
    List<Right> queryRightInfoAll();
}