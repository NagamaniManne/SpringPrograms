package com.sathya.springex;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.sathya.springex")
public class JavaConfig {
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3307/sathya");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
//	 @Bean
//	  public JdbcTemplate jdbcTemplate() {
//	    JdbcTemplate jdbcTemplate = new JdbcTemplate();
//	    jdbcTemplate.setDataSource(dataSource());
//	    return jdbcTemplate;
//	  }
//
//	  @Bean
//	  public EmployeeDao employeeDao()
//	  {
//	    EmployeeDaoImpl empDao = new EmployeeDaoImpl();
//	    empDao.setJdbcTemplate(jdbcTemplate());
//	    return empDao;
//	  }
}