package com.authority.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authority.management.dao.RightMapper;
import com.authority.management.entity.Result;
import com.authority.management.entity.enums.CodeTagEnum;
import com.authority.management.service.RightService;
@Service
public class RightServiceImpl implements RightService{
	
	@Autowired
	RightMapper rightMapper;

	@Override
	public Result<Object> getRightInfoAll() {
		Result<Object> result = new Result<Object>();
		result.setCode(CodeTagEnum.SUCCESS.getCode());
		result.setMessage(CodeTagEnum.SUCCESS.getMessage());
		result.setDesc("获取所有权限信息");
		result.setData(rightMapper.queryRightInfoAll());
		return result;
	}

}
