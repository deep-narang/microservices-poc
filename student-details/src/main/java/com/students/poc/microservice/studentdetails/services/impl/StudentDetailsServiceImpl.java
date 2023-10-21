package com.students.poc.microservice.studentdetails.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.poc.microservice.studentdetails.dto.StudentDetailsDTO;
import com.students.poc.microservice.studentdetails.entities.Student;
import com.students.poc.microservice.studentdetails.exception.entity.StudentDetailsException;
import com.students.poc.microservice.studentdetails.helper.StudentDetailsHelper;
import com.students.poc.microservice.studentdetails.repository.StudentDetailsRepository;
import com.students.poc.microservice.studentdetails.services.StudentDetailsService;
import com.students.poc.microservice.studentdetails.utils.ObjectConversionUtils;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

	@Autowired
	private StudentDetailsRepository studentDetailsRepository;
	
	@Autowired
	private StudentDetailsHelper studentDetailsHelper;
	
	@Override
	public StudentDetailsDTO createStudent(StudentDetailsDTO detailsDTO) {
		detailsDTO.setRegistrationNumber(studentDetailsHelper.generateStudentRegistrationNumber());
		studentDetailsRepository.save(ObjectConversionUtils.studentDtoToEntityConversion(detailsDTO));
		return detailsDTO;
	}

	@Override
	public List<StudentDetailsDTO> getAllStudents() {
		return studentDetailsRepository.findAll()
				.stream()
				.map(student -> ObjectConversionUtils.studentEntityToDtoConversion(student))
				.collect(Collectors.toList());
	}

	@Override
	public StudentDetailsDTO getStudentByRegistrationNumber(String id) {
		Student student = studentDetailsRepository.findById(id)
				.orElseThrow(() -> new StudentDetailsException("Student with given ID not found!"));
		return ObjectConversionUtils.studentEntityToDtoConversion(student);
	}

}
