package com.sathya.lombokex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

//@Builder
//@ToString
public class Employee {
	private int empId;
	@NonNull private String empName;
	private double empSalary;
}
