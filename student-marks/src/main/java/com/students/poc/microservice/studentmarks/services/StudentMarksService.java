package com.students.poc.microservice.studentmarks.services;

import java.util.List;

import com.students.poc.microservice.studentmarks.dto.StudentMarksDTO;

public interface StudentMarksService {
	
	StudentMarksDTO storeMarksOfStudent(StudentMarksDTO studentMarksDTO);

	StudentMarksDTO getMarksById(String id);

	List<StudentMarksDTO> getAllMarks();

}
