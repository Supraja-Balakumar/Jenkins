package com.supraja.SimpleApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Autowired
	Address address;
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
    
//    public Student()
//    {
//    	System.out.println("Object Created");
//    }
	public Student() {
		super();
		System.out.println("Object Created");
		// TODO Auto-generated constructor stub
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
		System.out.println("Student Class");
		address.show();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
	
}
