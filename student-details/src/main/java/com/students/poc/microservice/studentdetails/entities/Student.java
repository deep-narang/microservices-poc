package com.students.poc.microservice.studentdetails.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	
	@Id
	@Column(name = "registration_no")
	private String registrationNumber;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "father_name", nullable = false)
	private String fatherName;
	
	@Column(name = "mother_name", nullable = false)
	private String motherName;
	
	@Column(name = "mobile_no", nullable = false)
	private long contactNumber;

}
