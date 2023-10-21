package com.students.poc.microservice.studentmarks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.poc.microservice.studentmarks.dto.StudentMarksDTO;
import com.students.poc.microservice.studentmarks.services.StudentMarksService;

import jakarta.ws.rs.GET;

@RestController
@RequestMapping("/marks")
public class StudentMarksController {
	
	@Autowired
	private StudentMarksService studentMarksService;
	
	@PostMapping("/create")
	public StudentMarksDTO storeMarksOfStudent(@RequestBody StudentMarksDTO studentMarksDTO) {
		return studentMarksService.storeMarksOfStudent(studentMarksDTO);
	}
	
	@GetMapping("/{id}")
	public StudentMarksDTO getMarksById(@PathVariable String id) {
		return studentMarksService.getMarksById(id);
	}
	
	@GetMapping("/all")
	public List<StudentMarksDTO> getAllMarksDetails(){
		return studentMarksService.getAllMarks();
	}

}
