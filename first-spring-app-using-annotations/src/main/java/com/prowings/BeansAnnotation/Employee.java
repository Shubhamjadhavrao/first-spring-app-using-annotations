package com.prowings.BeansAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
//    @Value(value = "1")
    private int id ;
//    @Value(value = "Ram")
     private String name;
//    @Value(value = "Pune")
     private String Address;
   
    public Employee() {
	super();
	
    }

    public Employee(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + "]";
    }
    
    
    

}
