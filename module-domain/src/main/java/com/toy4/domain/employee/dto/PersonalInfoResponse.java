package com.toy4.domain.employee.dto;

import java.time.LocalDate;
import com.toy4.domain.employee.domain.Employee;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
	public class PersonalInfoResponse {

	private Long employeeId;
	private String department;
	private String name;
	private String email;
	private String phone;
	private LocalDate hireDate;
	private String profilePath;

	public static PersonalInfoResponse from(Employee employee) {
		return PersonalInfoResponse.builder()
			.employeeId(employee.getId())
			.department(employee.getDepartment().getType().getDescription())
			.name(employee.getName())
			.email(employee.getEmail())
			.phone(employee.getPhone())
			.hireDate(employee.getHireDate())
			.profilePath(employee.getProfileImagePath())
			.build();
	}
}
