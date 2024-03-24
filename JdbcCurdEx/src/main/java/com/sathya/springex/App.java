package com.sathya.springex;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new AnnotationConfigApplicationContext(JavaConfig.class);
        EmployeeDao employeeDao=context.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
        int createres = employeeDao.create();
        System.out.println("Table created successfully....."+createres);
        
        int res= employeeDao.save(new Employee(105, "eruygfu", 29100.78));
        System.out.println("Data inserted "+res);
        
        List<Employee> emps = List.of(
        		new Employee(101,"ergf",65237.8),
        		new Employee(02,"fwed",65645.98)
        		);
        int saveAllres=employeeDao.saveAll(emps);
//        String empName = employeeDao.getEmployeeName(103);
//        System.out.println("Employee name is : "+empName);
//        int upres=employeeDao.updateEmpDetails(new Employee(102, "nagamani", 897989.08));
//        System.out.println("Details updated "+upres);
//        int delres=employeeDao.deleteDetails(104);
//        System.out.println("Deleted successfully...."+delres);
//        List<Employee> employee = employeeDao.findAll();
//        System.out.println(employee);
    }
}