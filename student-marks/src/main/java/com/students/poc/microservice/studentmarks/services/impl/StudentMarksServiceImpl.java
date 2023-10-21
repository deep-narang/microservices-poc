package com.students.poc.microservice.studentmarks.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.poc.microservice.studentmarks.dto.StudentMarksDTO;
import com.students.poc.microservice.studentmarks.entity.Marks;
import com.students.poc.microservice.studentmarks.exception.StudentMarksException;
import com.students.poc.microservice.studentmarks.repository.StudentMarksRepository;
import com.students.poc.microservice.studentmarks.services.StudentMarksService;
import com.students.poc.microservice.studentmarks.util.ObjectConversionUtil;

@Service
public class StudentMarksServiceImpl implements StudentMarksService {
	
	@Autowired
	private StudentMarksRepository studentMarksRepository;

	@Override
	public StudentMarksDTO storeMarksOfStudent(StudentMarksDTO studentMarksDTO) {
		studentMarksRepository.save(ObjectConversionUtil.marksDtoToEntityConversion(studentMarksDTO));
		return studentMarksDTO;
	}

	@Override
	public StudentMarksDTO getMarksById(String id) {
		Marks marks = studentMarksRepository.findById(id).orElseThrow(() -> new StudentMarksException(String.format("Marks of Student with Registration %s not found!", id)));
		return ObjectConversionUtil.marksEntityToDtoConversion(marks);
	}

	@Override
	public List<StudentMarksDTO> getAllMarks() {
		return studentMarksRepository.findAll().stream()
				.map(marks -> ObjectConversionUtil.marksEntityToDtoConversion(marks))
				.collect(Collectors.toList());
	}

}
