package com.students.poc.microservice.studentmarks.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.students.poc.microservice.studentmarks.exception.StudentMarksException;
import com.students.poc.microservice.studentmarks.exception.repsonse.StudentMarksExceptionResponse;

@RestControllerAdvice
public class GlobalHttpHandler {
	
	@ExceptionHandler(StudentMarksException.class)
	public ResponseEntity<StudentMarksExceptionResponse> studentMarksNotFoundException(Exception e) {
		return new ResponseEntity<StudentMarksExceptionResponse>(new StudentMarksExceptionResponse(e.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
	}

}
