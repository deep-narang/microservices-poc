package com.students.poc.microservice.studentmarks.entity;

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
@Table(name = "student_marks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Marks {
	
	@Id
	@Column(name = "registration_number")
	private String id;
	
	@Column(name = "class")
	private Integer standard;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "marks")
	private Integer marks;
	

}
