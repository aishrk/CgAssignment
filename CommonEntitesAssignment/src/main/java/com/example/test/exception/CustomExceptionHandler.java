package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.test.model.ErrorMssages;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMssages> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorMssages errorMssages = new ErrorMssages("500", ex.getMessage(), "http://document.internal");
		return new ResponseEntity<>(errorMssages, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(RecordNotFoundException.class)
	public final ResponseEntity<ErrorMssages> handleUserNotFoundException(RecordNotFoundException ex, WebRequest request) {

		ErrorMssages errorMssages = new ErrorMssages("400", ex.getMessage(), "http://document.internal");
		return new ResponseEntity<>(errorMssages, HttpStatus.NOT_FOUND);
	}
}