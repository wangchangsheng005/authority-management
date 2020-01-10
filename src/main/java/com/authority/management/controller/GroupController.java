package com.authority.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authority.management.entity.Result;
import com.authority.management.service.GroupService;

/**
 * 
* @ClassName: GroupService 
* @Description: TODO 组 
* @author Mr.wang 
* @date 2020年1月7日 上午10:48:26 
*
 */
@RestController
@RequestMapping(value = "group")
public class GroupController {
	
	@Autowired
	GroupService groupService;

	
	@RequestMapping("getGroupInfoAll")
	public Result<Object> getGroupInfoAll() {
		return groupService.getGroupInfoAll();
	}

}
