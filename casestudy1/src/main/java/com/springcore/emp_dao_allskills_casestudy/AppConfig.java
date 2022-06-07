
package com.springcore.emp_dao_allskills_casestudy;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.springcore.emp_dao_allskills_casestudy")
@PropertySource(value = "classpath:dbproperties.properties")
public class AppConfig {
	
 @Autowired
 Environment env;
	
 @Bean(name="dataSource")
 public DataSource dataSource()
 {
  System.out.println(env.getProperty("db.url"));
	
  DriverManagerDataSource ds = new DriverManagerDataSource();
  ds.setDriverClassName(env.getProperty("db.driver"));
  ds.setUrl(env.getProperty("db.url"));
  ds.setUsername(env.getProperty("db.user"));
  ds.setPassword(env.getProperty("db.password"));
  return ds;
  
 }

 @Bean(name="jdbcTemplate")
 public JdbcTemplate jdbcTemplate()
 {
  JdbcTemplate template = new JdbcTemplate();
  template.setDataSource(dataSource());
  return template;
 }
}

