package com.prowings.zeroxmlconfig;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestZeroXml {
    public static void main(String[] args) {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
	
//	Bike bike2 = context.getBean("bike2", Bike.class);
//	System.out.println(bike2);
	
	Bus b1 = context.getBean(Bus.class);
	System.out.println(b1);
	
	System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	
	System.out.println("Bus Beans counter :"+Bus.counter);
	
	context.registerShutdownHook();
	
	
	
    }

}
