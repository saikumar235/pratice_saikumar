
package com.springcore.emp_dao_allskills_casestudy.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages="com.springcore.emp_dao_allskills_casestudy")
public class JavaConfig {
	
	
 @Bean(name="dataSource")
 public DriverManagerDataSource dataSource()
 {
  DriverManagerDataSource dms = new DriverManagerDataSource();
  dms.setDriverClassName("com.mysql.cj.jdbc.Driver");
  dms.setUrl("jdbc:mysql://localhost:3306/training?useSSL=false");
  dms.setUsername("root");
  dms.setPassword("Saikumar@123");
  
  return dms;
  
 }
	
 @Bean(name="jdbcTemplate")
 public JdbcTemplate jdbctemplate(DataSource dataSource) {
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate();
  jdbcTemplate.setDataSource(dataSource);
  
  return jdbcTemplate ;
  
 }
	
	
 @Bean(name="dao")
 public DepartmentDaoJDBCTemplateImpl departmentDao(JdbcTemplate jdbcTemplate) {
  
  DepartmentDaoJDBCTemplateImpl dao = new DepartmentDaoJDBCTemplateImpl();
  dao.setJdbcTemplate(jdbcTemplate);
  return dao;
 }

}