package com.authority.management.service.impl;


import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.authority.management.dao.TokenMapper;
import com.authority.management.dao.UserMapper;
import com.authority.management.entity.Result;
import com.authority.management.entity.Token;
import com.authority.management.entity.User;
import com.authority.management.entity.enums.CodeTagEnum;
import com.authority.management.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Autowired
	TokenMapper tokenMapper;
	
	@Override
	public Result<Object> getUserInfoAll() {
		Result<Object> result = new Result<Object>();
		result.setCode(CodeTagEnum.SUCCESS.getCode());
		result.setMessage(CodeTagEnum.SUCCESS.getMessage());
		result.setDesc("获取所有用户信息");
		result.setT(userMapper.queryUserInfoAll());
		return result;
	}

	@Override
	public Result<Object> updateUserInfo(User user) {
		Result<Object> result = new Result<Object>();
		int tag = userMapper.updateByPrimaryKeySelective(user);
		if(tag == 1) {
			result.setCode(CodeTagEnum.SUCCESS.getCode());
			result.setMessage(CodeTagEnum.SUCCESS.getMessage());
		}else {
			result.setCode(CodeTagEnum.ERROR.getCode());
			result.setMessage(CodeTagEnum.ERROR.getMessage());
		}
		return result;
	}

	@Transactional
	@Override
	public Result<Object> login(User user) {
		Result<Object> result = new Result<Object>();
		User u = userMapper.login(user);
		boolean isFlag = false;
		Token t = new Token();
		if(u != null) {
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append(u.getId()).append("_").append(u.getLoginAccount()).append("_").append(u.getLoginPassword()).append(System.currentTimeMillis());
	        //编码
	        String token = Base64.getEncoder().encodeToString(String.valueOf(sBuilder).getBytes(StandardCharsets.UTF_8));
	        t.setToken(token);
	        int i = tokenMapper.insertSelective(t);
	        if(i == 1) {
	        	isFlag = true;
	        }
		}
		if(isFlag) {
			result.setCode(CodeTagEnum.SUCCESS.getCode());
			result.setMessage(CodeTagEnum.SUCCESS.getMessage());
			result.setT(t);
			result.setMessage("登录成功");
		}else {
			result.setCode(CodeTagEnum.ERROR.getCode());
			result.setMessage(CodeTagEnum.ERROR.getMessage());
			result.setMessage("登录失败");
		}
		return result;
	}

	@Override
	public Result<Object> register(User user) {
		Result<Object> result = new Result<Object>();
		if(user != null) {
			if(StringUtils.hasText(user.getLoginAccount())) {
				result.setCode(CodeTagEnum.ERROR.getCode());
				result.setMessage(CodeTagEnum.ERROR.getMessage());
				result.setMessage("账号不可以为空！！！");
				return result;
			}
			if(StringUtils.hasText(user.getLoginPassword())) {
				result.setCode(CodeTagEnum.ERROR.getCode());
				result.setMessage(CodeTagEnum.ERROR.getMessage());
				result.setMessage("密码不可以为空！！！");
				return result;
			}
			if(StringUtils.isEmpty(user.getName())) {
				user.setName(user.getLoginAccount());
			}
			int i = userMapper.insertSelective(user);
			if(i == 1) {
				result.setCode(CodeTagEnum.SUCCESS.getCode());
				result.setMessage(CodeTagEnum.SUCCESS.getMessage());
				result.setMessage("注册成功！！！");
				return result;
			}
		}else {
			result.setCode(CodeTagEnum.ERROR.getCode());
			result.setMessage(CodeTagEnum.ERROR.getMessage());
			result.setMessage("注册信息有误！！！");
		}
		return result;
	}

	@Override
	public Result<Object> loginOut(String token) {
		Result<Object> result = new Result<Object>();
		int d = tokenMapper.updateBydelete(token);
		if(d == 1) {
			result.setCode(CodeTagEnum.SUCCESS.getCode());
			result.setMessage(CodeTagEnum.SUCCESS.getMessage());
			result.setMessage("退出成功！！！");
		}else {
			result.setCode(CodeTagEnum.ERROR.getCode());
			result.setMessage(CodeTagEnum.ERROR.getMessage());
			result.setMessage("退出失败！！！");
		}
		return result;
	}

	/*
	 * public static void main(String[] args) { String text = "base64 in java8 lib";
	 * //编码 String encode =
	 * Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
	 * System.out.println(encode);
	 * 
	 * //解码 String decode = new String(Base64.getDecoder().decode(encode),
	 * StandardCharsets.UTF_8); System.out.println(decode); }
	 */
}
