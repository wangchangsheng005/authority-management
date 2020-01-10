package com.authority.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authority.management.entity.Result;
import com.authority.management.service.RightService;

/**
 * 
* @ClassName: RightController 
* @Description: TODO 权限信息
* @author Mr.wang 
* @date 2020年1月7日 上午10:44:23 
*
 */
@RestController
@RequestMapping(value = "right")
public class RightController {
	
	@Autowired
	RightService rightService;

	
	@RequestMapping("getRightInfoAll")
	public Result<Object> getRightInfoAll() {
		return rightService.getRightInfoAll();
	}

}
