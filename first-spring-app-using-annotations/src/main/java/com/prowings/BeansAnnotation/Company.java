package com.prowings.BeansAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Autowired
    @Qualifier("me   ")
    Engineer engineer;

    public void details() {
	engineer.devlopment();
    }


    @Override
    public String toString() {
	return "Company [engineer="  + "]";
    }

}
