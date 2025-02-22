package com.sathya.springex;

import java.util.List;

public interface EmployeeDao {
	
	public int create();
	
	public int save(Employee emp);
	
	public int saveAll(List<Employee> emps);
	
	public Employee fingById(int eid);
	
	public List<Employee> findAll();
	
	public int updateById(Employee emp);
	
	public int deleteAll(int eid);
	
	public int drop();
}
