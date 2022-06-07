
package com.springcore.emp_dao_allskills_casestudy.dao;

import com.springcore.emp_dao_allskills_casestudy.Department;
import com.springcore.emp_dao_allskills_casestudy.Employee;

public interface DepartmentDao {
	
 public Department getDepartment(int deptno);

public Iterable<Employee> findAll();

}
