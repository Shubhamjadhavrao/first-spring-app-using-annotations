package com.prowings.xmlAnnotationCombined;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
    @Value(value = "21")
    private int id;
    @Value(value = "KTm")
    private String name;
    @Value(value = "electric")
    private String type;

    public Bike() {
	super();
    }

    public Bike(int id, String name, String type) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
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

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    @Override
    public String toString() {
	return "Bike [id=" + id + ", name=" + name + ", type=" + type + "]";
    }

}
