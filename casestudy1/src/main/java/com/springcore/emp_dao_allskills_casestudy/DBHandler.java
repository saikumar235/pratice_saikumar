
package com.springcore.emp_dao_allskills_casestudy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.emp_dao_allskills_casestudy.dao.DepartmentDao;
import com.springcore.emp_dao_allskills_casestudy.dao.EmployeeDao;

import com.springcore.emp_dao_allskills_casestudy.Employee;
@Component
public class DBHandler {
 @Autowired
 private EmployeeDao empDao;
 @Autowired
 private DepartmentDao deptdao;
	
 public void printEmployee(int no)
 {
  System.out.println(empDao.getEmployee(no));
 }

	
 public void printAllEmployees()
 {
  List<Employee> list = empDao.findAll();
  list.forEach(t->System.out.println(t));
  
 }
	
	
 public void printDepartmnet(int deptNo)
 {
  System.out.println(deptdao.getDepartment(deptNo));
 }
	
 public void printAllDepartments()
 {
  deptdao.findAll().forEach(d->System.out.println(d));
 }
}
