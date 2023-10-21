package com.students.poc.microservice.studentmarks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.poc.microservice.studentmarks.entity.Marks;

public interface StudentMarksRepository extends JpaRepository<Marks, String> {

}
