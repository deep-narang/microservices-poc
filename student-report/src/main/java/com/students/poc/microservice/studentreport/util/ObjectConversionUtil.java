package com.students.poc.microservice.studentreport.util;

import com.students.poc.microservice.studentreport.dto.StudentReportDto;
import com.students.poc.microservice.studentreport.entity.StudentReport;

public class ObjectConversionUtil {
	
	public static StudentReport reportDtoToEntityConversion(StudentReportDto dto) {
		return StudentReport.builder()
				.id(dto.getId())
				.section(dto.getSection())
				.standard(dto.getStandard())
				.build();
	}
	
	public static StudentReportDto reportEntityToReportConversion(StudentReport studentReport) {
		return StudentReportDto.builder()
				.id(studentReport.getId())
				.section(studentReport.getSection())
				.standard(studentReport.getStandard())
				.build();
	}

}
