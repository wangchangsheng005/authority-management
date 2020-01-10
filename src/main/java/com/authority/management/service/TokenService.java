package com.authority.management.service;

import javax.servlet.http.HttpServletResponse;

public interface TokenService {
	
	void verifyToken(String token,HttpServletResponse response);

}
