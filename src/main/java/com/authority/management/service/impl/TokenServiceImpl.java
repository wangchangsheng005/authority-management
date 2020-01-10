package com.authority.management.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.authority.management.dao.TokenMapper;
import com.authority.management.entity.Result;
import com.authority.management.entity.Token;
import com.authority.management.entity.enums.CodeTagEnum;
import com.authority.management.service.TokenService;
import com.authority.management.utils.DateUtil;

@Service
public class TokenServiceImpl implements TokenService{

	@Autowired
	TokenMapper tokenMapper;
	
	@Override
	public void verifyToken(String token,HttpServletResponse response) {
		Token t = tokenMapper.selectTokenByToken(token);
		try {
			if(t == null) {
				Result<Object> result = new Result<Object>();
				result.setCode(CodeTagEnum.ERROR.getCode());
				result.setMessage(CodeTagEnum.ERROR.getMessage());
				result.setMessage("TOKEN 验证失败!");
				response.getWriter().write(JSONObject.toJSONString(result));
				return;
			}else {
				long crrentTime = System.currentTimeMillis();
				if((crrentTime - DateUtil.dateToStamp(String.valueOf(t.getUpdateTime()))) < 86400000) {
					tokenMapper.updateByPrimaryKeySelective(t);
				}else {
					Result<Object> result = new Result<Object>();
					result.setCode(CodeTagEnum.ERROR.getCode());
					result.setMessage(CodeTagEnum.ERROR.getMessage());
					result.setMessage("TOKEN 失效，请重新获取!");
					response.getWriter().write(JSONObject.toJSONString(result));
					t.setDeleteStatus(1);
					tokenMapper.updateByPrimaryKeySelective(t);
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
