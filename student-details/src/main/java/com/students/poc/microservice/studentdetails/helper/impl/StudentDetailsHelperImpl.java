package com.students.poc.microservice.studentdetails.helper.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.students.poc.microservice.studentdetails.helper.StudentDetailsHelper;

@Service
public class StudentDetailsHelperImpl implements StudentDetailsHelper{

	@Override
	public String generateStudentRegistrationNumber() {
		return UUID.randomUUID().toString();
	}

}
