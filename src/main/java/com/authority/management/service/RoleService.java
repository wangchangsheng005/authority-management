package com.authority.management.service;

import com.authority.management.entity.Result;

/**
 * 
* @ClassName: RoleService 
* @Description: TODO 角色 权限
* @author Mr.wang 
* @date 2020年1月7日 上午10:08:03 
*
 */
public interface RoleService {

	/**
	 * 
	* @Title: getRoleInfoAll 
	* @Description: TODO 返回所有 角色信息
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> getRoleInfoAll();
}
