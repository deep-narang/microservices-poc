package com.students.poc.microservice.studentreport.exception.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentReportExceptionResponse {
	
	private String message;
	private HttpStatus httpStatus;

}
