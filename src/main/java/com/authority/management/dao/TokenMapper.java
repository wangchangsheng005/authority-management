package com.authority.management.dao;

import com.authority.management.entity.Token;

public interface TokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Token record);

    int insertSelective(Token record);

    Token selectByPrimaryKey(Long id);
    
    Token selectTokenByToken(String token);

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
    
    int updateBydelete(String token);
}