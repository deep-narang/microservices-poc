package com.students.poc.microservice.studentdetails.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.students.poc.microservice.studentdetails.exception.entity.StudentDetailsException;
import com.students.poc.microservice.studentdetails.exception.response.StudentDetailExceptionResponse;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(StudentDetailsException.class)
	public ResponseEntity<StudentDetailExceptionResponse> studentDetailsException(Exception e) {
		return new ResponseEntity<StudentDetailExceptionResponse>(new StudentDetailExceptionResponse(e.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
	}
	
}
