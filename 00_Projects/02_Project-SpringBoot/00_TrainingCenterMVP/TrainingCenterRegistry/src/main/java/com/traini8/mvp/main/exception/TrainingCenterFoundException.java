package com.traini8.mvp.main.exception;

/*
 * When we throw TrainingCenterFoundException then this class gets called and the message we have
 * provided it will get displayed in response.
 * 
 * This exception gets thrown when there is already TrainingCenter is present in database.
 * 
 * */

public class TrainingCenterFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public TrainingCenterFoundException() {
		super("Training Center with the provided email or phone number already exists");
	}

	
}
