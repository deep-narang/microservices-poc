package com.students.poc.microservice.studentreport.entity;

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
@Table(name = "student_report")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentReport {
	
	@Id
	@Column(name = "registration_number")
	private String id;
	
	@Column(name = "class")
	private Integer standard;
	
	@Column(name = "section")
	private char section;

}
