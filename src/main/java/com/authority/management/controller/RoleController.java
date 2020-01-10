package com.authority.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authority.management.entity.Result;
import com.authority.management.service.RoleService;

/**
 * 
* @ClassName: RoleController 
* @Description: TODO 角色
* @author Mr.wang
* @date 2020年1月7日 上午10:47:03 
*
 */
@RestController
@RequestMapping(value = "role")
public class RoleController {
	
	@Autowired
	RoleService roleService;

	
	@RequestMapping("getRoleInfoAll")
	public Result<Object> getRoleInfoAll() {
		return roleService.getRoleInfoAll();
	}

}
