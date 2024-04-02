package com.prowings.xmlAnnotationCombined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlAnnotationCombined {
    public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans2.xml");
	
	Cycle c  = context.getBean("c1",Cycle.class);
	
	System.out.println(c);
	
	
	Flipcart f  = context.getBean("M",Flipcart.class);
	System.out.println(f);
	
	
	Car e  =  context.getBean("C",Car.class);
	System.out.println(e);
	
	Bike bike = context.getBean("bike",Bike.class);
	System.out.println(bike);
	
    }
    

}
