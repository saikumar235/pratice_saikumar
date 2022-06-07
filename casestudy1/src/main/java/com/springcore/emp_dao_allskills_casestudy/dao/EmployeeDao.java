
package com.springcore.emp_dao_allskills_casestudy.dao;
/**
 * 
 * @author madde
 *
 */

import java.util.List;

import com.springcore.emp_dao_allskills_casestudy.Employee;

public interface EmployeeDao {
  Employee getEmployee(int empNo);
  List<Employee> findAll();

}