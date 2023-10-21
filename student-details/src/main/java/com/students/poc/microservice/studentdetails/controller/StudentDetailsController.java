package com.students.poc.microservice.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.students.poc.microservice.studentdetails.dto.StudentDetailsDTO;
import com.students.poc.microservice.studentdetails.services.StudentDetailsService;

@RestController
@RequestMapping("/student")
public class StudentDetailsController {
	
	@Autowired
	private StudentDetailsService studentDetailsService;
	
	@PostMapping("/create")
	public StudentDetailsDTO createStudent(@RequestBody StudentDetailsDTO studentDetailsDTO) {
		return studentDetailsService.createStudent(studentDetailsDTO);
	}
	
	@GetMapping("/all")
	public List<StudentDetailsDTO> getAllStudents() {
		return studentDetailsService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public StudentDetailsDTO getStudentById(@PathVariable String id) {
		return studentDetailsService.getStudentByRegistrationNumber(id);
	}
	

}
