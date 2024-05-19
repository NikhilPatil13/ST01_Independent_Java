package com.restBloggingApp.main.dto;

public class BaseResponse<T> {

	private Integer statusCode;
	private String message;
	private T responseData;

	public BaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseResponse(Integer statusCode, String message, T responseData) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.responseData = responseData;
	}
	

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
	
	@Override
	public String toString() {
		return "BaseResponse [statusCode=" + statusCode + ", message=" + message + ", responseData=" + responseData
				+ "]";
	}
		
}
