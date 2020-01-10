package com.authority.management.entity.enums;

public enum CodeTagEnum {
	
	SUCCESS(1000,"成功"),
	
	ERROR(2000,"异常");
	
	private int code;
	
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private CodeTagEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
	

}
