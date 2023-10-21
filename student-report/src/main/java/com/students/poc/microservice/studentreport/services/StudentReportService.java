package com.students.poc.microservice.studentreport.services;

import java.util.List;

import com.students.poc.microservice.studentreport.dto.StudentReportDto;

public interface StudentReportService {
	
	StudentReportDto saveStudentReport(StudentReportDto studentReportDto);

	List<StudentReportDto> getAllStudentReport();

	StudentReportDto getStudentReportById(String id);

}
