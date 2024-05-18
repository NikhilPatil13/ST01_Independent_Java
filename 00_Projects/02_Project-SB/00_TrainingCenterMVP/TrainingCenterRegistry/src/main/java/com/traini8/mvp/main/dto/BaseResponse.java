package com.traini8.mvp.main.dto;

/*
 * This class is used to send response in proper format when we return.
 * */

public class BaseResponse<T> {

	private Integer statusCode;
	private String message;
	private T responseData;
	
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResponseData() {
		return responseData;
	}
	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}
	
	public BaseResponse(Integer statusCode, String message, T responseData) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.responseData = responseData;
	}	
}
