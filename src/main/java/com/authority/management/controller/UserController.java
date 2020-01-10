package com.authority.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authority.management.entity.Result;
import com.authority.management.entity.User;
import com.authority.management.service.UserService;


/**
 * 
* @ClassName: UserController 
* @Description: TODO 用户请求信息
* @author Mr.wang
* @date 2020年1月7日 上午10:43:19 
*
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	UserService userService;

	
	@RequestMapping("getUserInfoAll")
	public Result<Object> getUserInfoAll() {
		return userService.getUserInfoAll();
	}
	
	@RequestMapping("updateUserInfo")
	public Result<Object> updateUserInfo(User user) {
		return userService.updateUserInfo(user);
	}

}
