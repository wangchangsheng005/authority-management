package com.authority.management.service;


import com.authority.management.entity.Result;
import com.authority.management.entity.User;
/**
 * 
* @ClassName: UserService 
* @Description: TODO 用户信息
* @author Mr.wang 
* @date 2020年1月7日 上午10:01:03 
*
 */
public interface UserService {
	/**
	 * 
	* @Title: getUserInfoAll 
	* @Description: TODO 返回所有用户信息
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> getUserInfoAll();
	
	/**
	 * 
	* @Title: updateUserInfo 
	* @Description: TODO 修改用户信息
	* @param @param user
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> updateUserInfo(User user);
	
	/**
	 * 
	* @Title: login 
	* @Description: TODO 用户登录
	* @param @param user
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> login(User user);
	
	/**
	 * 
	* @Title: register 
	* @Description: TODO 用户注册
	* @param @param user
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> register(User user);
	/**
	 * 
	* @Title: loginOut 
	* @Description: TODO 用户退出
	* @param @param token
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> loginOut(String token);
	/**
	 * 
	* @Title: getUserInfo 
	* @Description: TODO 根据用户ID,查询用户的信息
	* @param @param userId
	* @param @return    设定文件 
	* @return Result<Object>    返回类型 
	* @throws
	 */
	Result<Object> getUserInfo(long userId);
}
