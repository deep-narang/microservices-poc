package com.students.poc.microservice.studentmarks.dto;

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
public class StudentMarksDTO {

	private String registrationNumber;
	private Integer standard;
	private Integer marks;
	private String subject;
	
}
