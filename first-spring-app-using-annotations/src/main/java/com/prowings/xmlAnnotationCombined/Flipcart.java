package com.prowings.xmlAnnotationCombined;

public class Flipcart {
    private double price;

    private String productname;

    private String company;

    public Flipcart() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Flipcart(double price, String productname, String company) {
	super();
	this.price = price;
	this.productname = productname;
	this.company = company;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public String getProductname() {
	return productname;
    }

    public void setProductname(String productname) {
	this.productname = productname;
    }

    public String getCompany() {
	return company;
    }

    public void setCompany(String company) {
	this.company = company;
    }

    @Override
    public String toString() {
	return "Flipcart [price=" + price + ", productname=" + productname + ", company=" + company + "]";
    }

}
