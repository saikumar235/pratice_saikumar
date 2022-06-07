
package com.springcore.emp_dao_allskills_casestudy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.emp_dao_allskills_casestudy.dao.DepartmentDaoJDBCTemplateImpl;
import com.springcore.emp_dao_allskills_casestudy.dao.JavaConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
  
  AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext();
  container.register(JavaConfig.class);
  container.refresh();
  DepartmentDaoJDBCTemplateImpl dao=(DepartmentDaoJDBCTemplateImpl)container.getBean("dao");
  
  
  
  
  System.out.println(dao.getDepartment(3));
  
    }
}