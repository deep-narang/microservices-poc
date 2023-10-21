package com.students.poc.microservice.studentreport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.poc.microservice.studentreport.dto.StudentReportDto;
import com.students.poc.microservice.studentreport.services.StudentReportService;

@RestController
@RequestMapping("/report")
public class StudentReportController {
	
	@Autowired
	private StudentReportService studentReportService;
	
	@PostMapping("/create")
	public StudentReportDto saveStudentReportDetails(@RequestBody StudentReportDto studentReportDto) {
		return studentReportService.saveStudentReport(studentReportDto);
	}
	
	@GetMapping("/all")
	public List<StudentReportDto> getAllStudentReport() {
		return studentReportService.getAllStudentReport();
	}
	
	@GetMapping("/{id}")
	public StudentReportDto getStudentReportById(@PathVariable String id) {
		return studentReportService.getStudentReportById(id);
	}

}
