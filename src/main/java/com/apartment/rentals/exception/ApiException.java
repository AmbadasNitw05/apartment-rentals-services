package com.apartment.rentals.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ApiException {

	private String message;
	private Throwable throwable;
	private HttpStatus httpStatus;
	private ZonedDateTime timestamp;
	
	public ApiException(String message, 
			Throwable throwable, 
			HttpStatus httpStatus, 
			ZonedDateTime timestamp) {
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
