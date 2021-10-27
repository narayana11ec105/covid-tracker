package com.lakshmi.covid.tracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lakshmi.covid.tracker.error.ErrorCode;
import com.lakshmi.covid.tracker.error.Error;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public Error handleResourceNotFoundException(ResourceNotFoundException userNotFoundException) {
		
		Error error = new Error();
		error.setErrorCode(ErrorCode.RESOURCE_NOT_FOUND);
		error.setCause(userNotFoundException.getLocalizedMessage());
		error.setMessage(userNotFoundException.getMessage());
		
		return error;
	}
	
}
