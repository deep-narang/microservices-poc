package com.students.poc.microservice.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.poc.microservice.studentdetails.entities.Student;

@Repository
public interface StudentDetailsRepository extends JpaRepository<Student, String> {

}
