package com.authority.management.config;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.authority.management.entity.Result;
import com.authority.management.entity.enums.CodeTagEnum;
import com.authority.management.service.impl.TokenServiceImpl;

/**
 * 
* @ClassName: OriginFilter 
* @Description: TODO 处理跨域问题
* @author Mr.wang 
* @date 2020年1月9日 下午3:39:59 
*
 */
@Component
public class OriginFilter implements Filter {
	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	// 处理跨域问题
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		// response.reset();
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACES");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers",
				"Origin,X-Requested-With,Content-Type,Accept,Authorization,token");
		response.setCharacterEncoding("utf-8");
		// 指定浏览器以什么码表解码服务器发送的数据
		response.setHeader("Content-Type", "text/json; charset=UTF-8");
		HttpServletRequest request = (HttpServletRequest) req;
		String uri = request.getRequestURI();
		String token = request.getHeader("token");
		if(StringUtils.isEmpty(token)) {
			if(!Pattern.matches(".*index.*", uri)) {
				Result<Object> result = new Result<Object>();
				result.setCode(CodeTagEnum.ERROR.getCode());
				result.setMessage(CodeTagEnum.ERROR.getMessage());
				result.setMessage("未登录不可使用!");
				response.getWriter().write(JSONObject.toJSONString(result));
				return;
			}
		}else {
			TokenServiceImpl t = new TokenServiceImpl();
			t.verifyToken(token, response);
		}
		chain.doFilter(req, res);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}