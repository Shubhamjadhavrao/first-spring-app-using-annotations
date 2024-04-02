package com.prowings.BeansAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value(value = "12")
    private int id;
    @Value(value = "Ram")
    private String name;
    @Autowired
    @Qualifier("address")
    private Address address;

    public Student() {
	super();
	System.out.println("student no arg constructor executed");

    }
//@Autowired
    public Student(Address address) {
	super();
	this.address = address;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    @Override
    public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

}
