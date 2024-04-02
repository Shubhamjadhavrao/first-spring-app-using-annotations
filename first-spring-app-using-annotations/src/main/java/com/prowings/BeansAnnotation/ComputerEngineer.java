package com.prowings.BeansAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cs")
public class ComputerEngineer implements Engineer {

    public void  devlopment() {
	System.out.println("Hello I am SoftwareEngineer!!!!!!!");

    }

//    @Override
//    public String toString() {
//	return "ComputerEngineer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//		+ super.toString() + "]";
//    }
  
}
