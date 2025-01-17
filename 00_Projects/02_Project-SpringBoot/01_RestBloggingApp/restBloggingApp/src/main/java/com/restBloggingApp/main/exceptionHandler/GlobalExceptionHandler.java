package com.restBloggingApp.main.exceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handlerForMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		
		Map<String,String> errorList = new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach(error->{
			String errorField = ((FieldError) error).getField();
			
			String errorMessage = error.getDefaultMessage();
			
			errorList.put(errorField, errorMessage);
		});
		
	
		return new ResponseEntity<Map<String,String>>(errorList,HttpStatus.BAD_REQUEST);
	}
	
}
