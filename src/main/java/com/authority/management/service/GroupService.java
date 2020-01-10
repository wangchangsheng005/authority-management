package com.authority.management.service;

import com.authority.management.entity.Result;

/**
 * 
* @ClassName: GroupService 
* @Description: TODO 组 权限
* @author Mr.wang 
* @date 2020年1月7日 上午10:00:15 
*
 */
public interface GroupService {

	/**
	 * 
	* @Title: getGroupInfoAll 
	* @Description: TODO 返回所有 组信息
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> getGroupInfoAll();
}
