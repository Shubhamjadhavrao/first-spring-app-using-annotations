package com.prowings.BeansAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("me")
public class MechanicalEngineer implements Engineer {

    public void devlopment() {
	System.out.println("Hello I am  AutoCadEngineer!!!!!!!");

    }

}
