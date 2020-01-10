package com.authority.management.service;

import com.authority.management.entity.Result;

/**
 * 
* @ClassName: RightService 
* @Description: TODO 权限
* @author Mr.wang 
* @date 2020年1月7日 上午10:08:22 
*
 */
public interface RightService {

	/**
	 * 
	* @Title: getRightInfoAll 
	* @Description: TODO 返回所有 权限信息
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> getRightInfoAll();
}
