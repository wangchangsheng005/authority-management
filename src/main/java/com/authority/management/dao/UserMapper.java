package com.authority.management.dao;

import java.util.List;

import com.authority.management.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //查询所有用户信息
    List<User> queryUserInfoAll();
    
    //登录
    User login(User user);
    
}