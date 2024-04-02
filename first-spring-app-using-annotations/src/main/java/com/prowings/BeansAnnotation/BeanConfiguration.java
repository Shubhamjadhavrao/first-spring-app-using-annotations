package com.prowings.BeansAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = "com.prowings.BeansAnnotation")
public class BeanConfiguration {
    @Bean(name = "emp")
    public Employee getEmployee() {
	Employee emp = new Employee();
	emp.setId(21);
	emp.setName("Krish");
	emp.setAddress("Mathura");
	return emp;
		
    }
    
    @Bean(name = {"emp1"})
    public Employee getEmployee1() {
	Employee emp2 = new Employee();
	emp2.setId(2);
	emp2.setName("Krishna");
	emp2.setAddress("Mathura");
	return emp2;
		
    }

}
