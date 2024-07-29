package com.supraja.SimpleApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
public class Student 
{

	private static final Logger LOGGER = Logger.getLogger(Student.class.getName());
	Address address;
	
	public Student(Address address) {
		super();
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Value("123")
    private int sid;
    @Value("Supraja")
	private String name;
    
	public Student() {
		super();
		System.out.println("Object Created");
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	
	public void display()
	{
		LOGGER.info("Student class");
		address.show();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
	
}
