package com.prowings.BeansAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("123")
    private int pin;
    @Value("Mumbai")
    private String city;
    @Value("India")
    private String country;

    public Address() {
	super();
	System.out.println("student no arg constructor executed");

    }

    public Address(int pin, String city, String country) {
	super();
	this.pin = pin;
	this.city = city;
	this.country = country;
    }

    public int getPin() {
	return pin;
    }

    public void setPin(int pin) {
	this.pin = pin;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    @Override
    public String toString() {
	return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
    }

}
