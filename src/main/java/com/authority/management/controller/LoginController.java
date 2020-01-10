package com.authority.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authority.management.entity.Result;
import com.authority.management.entity.User;
import com.authority.management.service.UserService;

/**
 * 
* @ClassName: LoginController 
* @Description: TODO 登录
* @author Mr.wang 
* @date 2020年1月9日 下午3:27:22 
*
 */
@RestController
@RequestMapping(value = "index")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("login")
	public Result<Object> login(@RequestBody User user) {
		
		return userService.login(user);
	}
	
	@PostMapping("register")
	public Result<Object> register(@RequestBody User user) {
		
		return userService.register(user);
	}
	
	@GetMapping("loginOut")
	public Result<Object> loginOut(String token) {
		
		return userService.loginOut(token);
	}

}
