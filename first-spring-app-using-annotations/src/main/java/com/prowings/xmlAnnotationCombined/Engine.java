package com.prowings.xmlAnnotationCombined;

public class Engine {
    private int id;
    private String name;

    public Engine() {
    }
    
    

    public Engine(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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

    @Override
    public String toString() {
	return "Engine [id=" + id + ", name=" + name + "]";
    }

}
