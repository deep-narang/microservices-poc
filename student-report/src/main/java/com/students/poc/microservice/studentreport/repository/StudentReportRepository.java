package com.students.poc.microservice.studentreport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.poc.microservice.studentreport.entity.StudentReport;

public interface StudentReportRepository extends JpaRepository<StudentReport, String> {

}
