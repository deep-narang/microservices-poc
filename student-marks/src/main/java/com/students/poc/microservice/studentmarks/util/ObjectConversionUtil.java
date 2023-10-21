package com.students.poc.microservice.studentmarks.util;

import com.students.poc.microservice.studentmarks.dto.StudentMarksDTO;
import com.students.poc.microservice.studentmarks.entity.Marks;

public class ObjectConversionUtil {
	
	public static Marks marksDtoToEntityConversion(StudentMarksDTO studentMarksDTO) {
		return Marks.builder()
				.id(studentMarksDTO.getRegistrationNumber())
				.marks(studentMarksDTO.getMarks())
				.standard(studentMarksDTO.getStandard())
				.subject(studentMarksDTO.getSubject())
				.build();
	}
	
	public static StudentMarksDTO marksEntityToDtoConversion(Marks marks) {
		return StudentMarksDTO.builder()
				.marks(marks.getMarks())
				.registrationNumber(marks.getId())
				.standard(marks.getStandard())
				.subject(marks.getSubject())
				.build();
	}

}
