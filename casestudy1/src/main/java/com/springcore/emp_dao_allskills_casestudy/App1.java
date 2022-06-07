package com.springcore.emp_dao_allskills_casestudy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class);
         DBHandler db = context.getBean(DBHandler.class);
         db.printEmployee(101);
         System.err.println("*****ALL Employee *** ");
         db.printAllEmployees();
         
         System.err.println("Departmets");
         
         db.printDepartmnet(50);
         System.err.println("*****ALL Departments");
     db.printAllDepartments();
     
     
    }
}
