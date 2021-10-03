package com.apartment.rentals.exception;

import java.time.ZonedDateTime;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ApiException> handleException(ApiRequestException exception){
		// 1. Create ApiException 
		ApiException apiException = new ApiException(
				exception.getMessage(), 
				exception, 
				HttpStatus.BAD_REQUEST, 
				ZonedDateTime.now());
		
		// 2. Return that ApiException object as response
		return new ResponseEntity<ApiException>(apiException, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ApiException> handleException(ConstraintViolationException exception){
		// 1. Create ApiException 
		ApiException apiException = new ApiException(
				exception.getMessage(), 
				exception, 
				HttpStatus.BAD_REQUEST, 
				ZonedDateTime.now());
		
		// 2. Return that ApiException object as response
		return new ResponseEntity<ApiException>(apiException, HttpStatus.BAD_REQUEST);
	}
}
