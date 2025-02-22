package com.sathya.springex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private EmployeeMapper employeeMapper;
	//@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create() {
		String sql = "create table employee(eid int primary key,ename varchar2(30),esalary float)";
		int count =jdbcTemplate.update(sql);
		return count;
	}
	@Override
	public int save(Employee emp) {
		String sql="insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql,emp.getEid(),emp.getEname(),emp.getEsalary());
	}
	@Override
	public int saveAll(List<Employee> emps) {
		int count=0;
		String sql="insert into employee values(?,?,?)";
//		emps.forEach(emp -> jdbcTemplate.update(sql,emp.getEid(),emp.getEname(),emp.getEsalary()));
		for(Employee emp : emps)
		{
			count = jdbcTemplate.update(sql,emp.getEid(),emp.getEname(),emp.getEsalary());
		}
		return count;
	}
	@Override
	public Employee fingById(int eid) {
		String sql = "select * from employee where eid = ?";
		 Employee employee = (Employee) jdbcTemplate.query(sql, employeeMapper);
		 return employee;
	}
	@Override
	public List<Employee> findAll() {
		String sql="select * from employee";
		List<Employee> employees =jdbcTemplate.query(sql, employeeMapper);
		return employees;
	}
	@Override
	public int updateById(Employee emp) {
		String sql="update employee set ename=?,esalary=? where eid=?";
		return jdbcTemplate.update(sql,emp.getEname(),emp.getEsalary(),emp.getEid());
	}
	@Override
	public int deleteAll(int eid) {
		String sql="delete from employee where eid=?";
		return jdbcTemplate.update(sql,eid);
	}
	@Override
	public int drop() {
		String sql = "drop table employee";
		int count = jdbcTemplate.update(sql);
		return count;
	}
	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate=jdbcTemplate;
//	}
//	
//	@Override
//	public int save(Employee emp) {
//		String sql="insert into employee values(?,?,?)";
//		return jdbcTemplate.update(sql,emp.getEid(),emp.getEid(),emp.getEsalary());
//	}
//
//	@Override
//	public String getEmployeeName(int eid) {
//		 String sql = "select ename from employee where eid = ?";
//		 String name = jdbcTemplate.queryForObject(sql,new Object[]{eid},String.class);
//		 return name;
//	}
//
//	@Override
//	public int updateEmpDetails(Employee emp) {
//		String sql="update employee set ename=?,esalary=? where eid=?";
//		return jdbcTemplate.update(sql,emp.getEname(),emp.getEsalary(),emp.getEid());
//	}



	

}
