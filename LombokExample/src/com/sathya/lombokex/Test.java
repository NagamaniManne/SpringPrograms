package com.sathya.lombokex;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee employee = new Employee(111, "ratan", 10000.45);
//		System.out.println(employee);
		
//		Employee employee2 = new Employee();
//		employee2.setEmpId(1002);
//		employee2.setEmpName("kasim");
//		employee2.setEmpSalary(20000.87);
//		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());
		
//		Employee employee = Employee.builder()
//				.empId(111)
//				.empName("ratan")
//				.empSalary(10000.76)
//				.build();
//		System.out.println(employee);
		
		
		Employee employee2 = new Employee();
		employee2.setEmpId(1002);
		employee2.setEmpName(null);
		employee2.setEmpSalary(20000.87);
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());
	}

}
