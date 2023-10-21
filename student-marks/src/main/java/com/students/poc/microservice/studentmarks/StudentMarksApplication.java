package com.students.poc.microservice.studentmarks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentMarksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMarksApplication.class, args);
	}

}
