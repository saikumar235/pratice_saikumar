package com.springcore.emp_dao_allskills_casestudy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.emp_dao_allskills_casestudy.Department;
public class DepartmentRowMapper implements RowMapper<Department> {

 @Override
 public Department mapRow(ResultSet rs, int rowNum) throws SQLException {

  Department d = new Department();
  d.setDeptno(rs.getInt(1));
  d.setDname(rs.getString(2));
  d.setLcode(rs.getInt(3));
  
  return d;
 }

}



