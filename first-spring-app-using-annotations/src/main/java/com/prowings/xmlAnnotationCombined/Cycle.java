package com.prowings.xmlAnnotationCombined;

import org.springframework.stereotype.Component;


public class Cycle {
    private int id;
    private String company;
    private String type;

    public Cycle() {
	super();

    }

    public Cycle(int id, String company, String type) {
	super();
	this.id = id;
	this.company = company;
	this.type = type;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getCompany() {
	return company;
    }

    public void setCompany(String company) {
	this.company = company;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    @Override
    public String toString() {
	return "Cycle [id=" + id + ", company=" + company + ", type=" + type + "]";
    }

}
