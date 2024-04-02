package com.prowings.xmlAnnotationCombined;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
      @Bean(name = "c1")
    public Cycle getCycle() {
	return new  Cycle(21, "RANGER", "KidsCycle");
	
    }
      
      @Bean(name = "M")
      public Flipcart getFlipcart() {
	return new Flipcart(12000, "Mi Pro mobile", "Mi");
	  
      }
      
      @Bean(name = "C")
      public Car getCar() {
	return  new Car(21, "BMW",getEngine());
	  
      }
      public Engine getEngine() {
		return  new Engine(21, "BMW");
		  
	      }

   

}
