
package com.springcore.emp_dao_allskills_casestudy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.emp_dao_allskills_casestudy.Department;
import com.springcore.emp_dao_allskills_casestudy.Employee;


public class DepartmentDaoJDBCTemplateImpl implements DepartmentDao{

 @Autowired
 private JdbcTemplate jdbcTemplate;
	
 public JdbcTemplate getJdbcTemplate() {
  return jdbcTemplate;
 }

 public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
  this.jdbcTemplate = jdbcTemplate;
 }
	
 @Override
 public Department getDepartment(int deptno) {

  String sql="select * from department where dname=?";
  DepartmentRowMapper rowmapper = new DepartmentRowMapper();
  Department department=(Department) jdbcTemplate.queryForObject(sql,rowmapper,deptno);
  return department;
 }


}

