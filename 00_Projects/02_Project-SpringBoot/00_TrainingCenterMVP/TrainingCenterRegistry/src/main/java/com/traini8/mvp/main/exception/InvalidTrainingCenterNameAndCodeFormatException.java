package com.traini8.mvp.main.exception;
/*
 * When we throw InvalidTrainingCenterNameAndCodeFormatException then this class gets called and the message we have
 * provided it will get displayed in response.
 * 
 * This exception get thrown is TrainingCenterName less than 40 characters or TrainingCenterCode is not in alphanumeric and 
 * contains 12 characters exactly.
 * */

public class InvalidTrainingCenterNameAndCodeFormatException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidTrainingCenterNameAndCodeFormatException() {
		super("Do Check :\n"
				+ "1) TrainingCenter Name should be less than 40 characters. \n"
				+ "2) TrainingCenter Code should be alphanumeric and exactly contains 12 characters only.");
	}
	
}
