package com.students.poc.microservice.studentdetails.services;

import java.util.List;

import com.students.poc.microservice.studentdetails.dto.StudentDetailsDTO;

public interface StudentDetailsService {
	
	StudentDetailsDTO createStudent(StudentDetailsDTO detailsDTO);

	List<StudentDetailsDTO> getAllStudents();

	StudentDetailsDTO getStudentByRegistrationNumber(String id);

}
