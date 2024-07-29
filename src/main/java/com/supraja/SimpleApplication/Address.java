package com.supraja.SimpleApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
  @Value("123")
  private int dno;
  
  @Value("Madurai")
  private String city;

public Address() {
	super();
}

public Address(int dno, String city) {
	super();
	this.dno = dno;
	this.city = city;
}

public int getDno() {
	return dno;
}

public void setDno(int dno) {
	this.dno = dno;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Address [dno=" + dno + ", city=" + city + "]";
}
  
  public void show()
  {
	  System.out.println("Doorno:" +dno);
	  System.out.println("City:" +city);
  }
  
}
