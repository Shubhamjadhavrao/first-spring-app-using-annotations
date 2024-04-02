package com.prowings.BeansAnnotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansAnnotationConfigTest {
    public static void main(String[] args) {
//	ApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans2.xml");
	
	ApplicationContext  context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
//	Employee emp = context.getBean("employee",Employee.class);
//	System.out.println(emp);
	Employee emp = context.getBean("emp",Employee.class);
	System.out.println(emp);
	
	Employee emp2 = context.getBean("emp1",Employee.class);
	System.out.println(emp2);
	
	System.out.println("Totat beans in conatiner:" + context.getBeanDefinitionCount());
	
	System.out.println("Names:"  + Arrays.toString(context.getBeanDefinitionNames()));
	
	Student student = context.getBean("student",Student.class);
	System.out.println(student);
	
	A a = context.getBean("a",A.class);
	System.out.println(a);
	
	Company company = context.getBean("company",Company.class);
	company.details();
	
    }

}
