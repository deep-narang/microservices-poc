package com.students.poc.microservice.studentdetails.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentDetailsDTO implements Serializable {

	private static final long serialVersionUID = -4366600923068383260L;
	
	private String registrationNumber;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private long mobileNumber; 

}
