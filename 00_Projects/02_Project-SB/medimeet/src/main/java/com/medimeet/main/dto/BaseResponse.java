package com.medimeet.main.dto;

public class BaseResponse<T>{

	private Integer statusCode;
	private String responseMessage;
	private T responseData;
	
	
	public BaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseResponse(Integer statusCode, String responseMessage, T responseData) {
		super();
		this.statusCode = statusCode;
		this.responseMessage = responseMessage;
		this.responseData = responseData;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public T getResponseData() {
		return responseData;
	}
	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}
	@Override
	public String toString() {
		return "BaseResponse [statusCode=" + statusCode + ", responseMessage=" + responseMessage + ", responseData="
				+ responseData + "]";
	}
	
}
