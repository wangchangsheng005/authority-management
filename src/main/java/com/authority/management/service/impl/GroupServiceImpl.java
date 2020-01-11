package com.authority.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authority.management.dao.GroupMapper;
import com.authority.management.entity.Result;
import com.authority.management.entity.enums.CodeTagEnum;
import com.authority.management.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	GroupMapper groupMapper;
	

	@Override
	public Result<Object> getGroupInfoAll() {
		Result<Object> result = new Result<Object>();
		result.setCode(CodeTagEnum.SUCCESS.getCode());
		result.setMessage(CodeTagEnum.SUCCESS.getMessage());
		result.setDesc("获取所有组信息");
		result.setData(groupMapper.queryGroupInfoAll());
		return result;
	}

}
