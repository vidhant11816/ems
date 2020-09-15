package com.yroots.ems.configs;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.yroots.ems.exceptions.ResourceNotFound;

@ControllerAdvice(annotations = RestController.class)
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { ResourceNotFound.class })
	protected ResponseEntity<Object> handleResourceNotFound(RuntimeException ex, WebRequest request) {
		String bodyOfResponse = ex.getMessage() + "";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
}
