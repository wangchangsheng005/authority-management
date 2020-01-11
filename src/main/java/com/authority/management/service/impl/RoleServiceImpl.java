package com.authority.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authority.management.dao.RoleMapper;
import com.authority.management.entity.Result;
import com.authority.management.entity.enums.CodeTagEnum;
import com.authority.management.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public Result<Object> getRoleInfoAll() {
		Result<Object> result = new Result<Object>();
		result.setCode(CodeTagEnum.SUCCESS.getCode());
		result.setMessage(CodeTagEnum.SUCCESS.getMessage());
		result.setDesc("获取所有角色信息");
		result.setData(roleMapper.queryRoleInfoAll());
		return result;
	}

}
