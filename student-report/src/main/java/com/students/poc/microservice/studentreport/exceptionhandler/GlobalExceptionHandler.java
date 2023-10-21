package com.students.poc.microservice.studentreport.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.students.poc.microservice.studentreport.exception.enity.StudentReportException;
import com.students.poc.microservice.studentreport.exception.response.StudentReportExceptionResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StudentReportException.class)
	public ResponseEntity<StudentReportExceptionResponse> studentReportException(Exception e) {
		return new ResponseEntity<StudentReportExceptionResponse>(new StudentReportExceptionResponse(e.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
	}

}
