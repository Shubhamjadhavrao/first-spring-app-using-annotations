package com.prowings.zeroxmlconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.prowings.zeroxmlconfig")
public class JavaBasedConfig {
//    @Bean(name = "bike2")
//	public Bike getBike()
//	{
//		Bike bike = new Bike();
//		bike.setId(555);
//		bike.setName("TVS");
//		bike.setType("RegularBike");
//		return bike;
//	}
	@Bean(name = "b",initMethod = "myInit")
	@Scope("prototype")
    public Bus gretBus() {
	Bus b = new Bus();
	b.setId(12);
	b.setCompany("redBus");
	b.setType("Traveller");
	return b;
    }
	@Bean
    public Engine getEngine() {
	Engine e =new  Engine();
	e.setId(21);
	e.setName("cr7");;
	return e;
	
    }
	


}