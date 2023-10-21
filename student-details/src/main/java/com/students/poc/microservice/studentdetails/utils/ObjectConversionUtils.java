package com.students.poc.microservice.studentdetails.utils;

import org.springframework.beans.factory.annotation.Autowired;

import com.students.poc.microservice.studentdetails.dto.StudentDetailsDTO;
import com.students.poc.microservice.studentdetails.entities.Student;
import com.students.poc.microservice.studentdetails.helper.StudentDetailsHelper;

public class ObjectConversionUtils {
	
	public static StudentDetailsDTO studentEntityToDtoConversion(Student student) {
		return StudentDetailsDTO.builder()
				.registrationNumber(student.getRegistrationNumber())
				.firstName(student.getFirstName())
				.lastName(student.getLastName())
				.fatherName(student.getFatherName())
				.motherName(student.getMotherName())
				.mobileNumber(student.getContactNumber())
				.build();
	}
	
	public static Student studentDtoToEntityConversion(StudentDetailsDTO studentDetailsDTO) {
		return Student.builder()
				.registrationNumber(studentDetailsDTO.getRegistrationNumber())
				.firstName(studentDetailsDTO.getFirstName())
				.lastName(studentDetailsDTO.getLastName())
				.fatherName(studentDetailsDTO.getFatherName())
				.motherName(studentDetailsDTO.getMotherName())
				.contactNumber(studentDetailsDTO.getMobileNumber())
				.build();
	}

}
