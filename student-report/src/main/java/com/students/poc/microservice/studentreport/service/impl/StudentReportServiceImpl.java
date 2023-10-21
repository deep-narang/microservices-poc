package com.students.poc.microservice.studentreport.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.poc.microservice.studentreport.dto.StudentReportDto;
import com.students.poc.microservice.studentreport.entity.StudentReport;
import com.students.poc.microservice.studentreport.exception.enity.StudentReportException;
import com.students.poc.microservice.studentreport.exception.response.StudentReportExceptionResponse;
import com.students.poc.microservice.studentreport.repository.StudentReportRepository;
import com.students.poc.microservice.studentreport.services.StudentReportService;
import com.students.poc.microservice.studentreport.util.ObjectConversionUtil;

@Service
public class StudentReportServiceImpl implements StudentReportService {
	
	@Autowired
	private StudentReportRepository studentReportRepository;

	@Override
	public StudentReportDto saveStudentReport(StudentReportDto studentReportDto) {
		studentReportRepository.save(ObjectConversionUtil.reportDtoToEntityConversion(studentReportDto));
		return studentReportDto;
	}

	@Override
	public List<StudentReportDto> getAllStudentReport() {
		return studentReportRepository.findAll()
				.stream().map(report -> ObjectConversionUtil.reportEntityToReportConversion(report))
				.collect(Collectors.toList());
	}

	@Override
	public StudentReportDto getStudentReportById(String id) {
		StudentReport studentReport = studentReportRepository.findById(id).orElseThrow(() -> new StudentReportException(String.format("Student Report with Id %s not found!", id)));
		return ObjectConversionUtil.reportEntityToReportConversion(studentReport);
	}

}
