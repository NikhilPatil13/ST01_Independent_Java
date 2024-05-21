package com.restBloggingApp.main.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.restBloggingApp.main.exception.UserAlreadyExistedException;
import com.restBloggingApp.main.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> handlerForUserNotFoundException(UserNotFoundException ex){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}
	
	
	@ExceptionHandler(UserAlreadyExistedException.class)
	public ResponseEntity<String> handlerForUserAlreadyExistedException(UserAlreadyExistedException ex){
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage()); 
	}
	
	
	
}
