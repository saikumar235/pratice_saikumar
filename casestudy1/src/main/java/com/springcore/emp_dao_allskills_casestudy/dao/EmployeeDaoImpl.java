
package com.springcore.emp_dao_allskills_casestudy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springcore.emp_dao_allskills_casestudy.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao {
 @Autowired
private JdbcTemplate template;
 @Override
 public Employee getEmployee(int empno) {
  
  return template.queryForObject("select * from employee1 where empno=?", new EmployeeRowMapper(), empno);
 }

 @Override
 public List<Employee> findAll() {
  
  return template.query("select * from employee1", new EmployeeRowMapper());
 }

}