package com.traini8.mvp.main.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.traini8.mvp.main.dto.BaseResponse;
import com.traini8.mvp.main.entities.TrainingCenter;
import com.traini8.mvp.main.exception.InvalidTrainingCenterNameAndCodeFormatException;
import com.traini8.mvp.main.exception.TrainingCenterFoundException;

/*
 * ExceptionHandler is used to handle userDefinedExceptions.
 * 
 * This class handles all the exceptions thrown by developer. It will return proper response to user.
 * 
 * */


@RestControllerAdvice
public class AllExceptionHandler {

	@ExceptionHandler(TrainingCenterFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handlerForTrainingCenterFound(TrainingCenterFoundException ex){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}
	
	@ExceptionHandler(InvalidTrainingCenterNameAndCodeFormatException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handlerForInvalidTrainingCenterNameAndCodeFormatException(InvalidTrainingCenterNameAndCodeFormatException ex){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}

	
}
