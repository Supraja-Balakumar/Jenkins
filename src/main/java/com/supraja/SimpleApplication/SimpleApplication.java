package com.supraja.SimpleApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SimpleApplication.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(SimpleApplication.class, args);
		Student stud=context.getBean(Student.class);
		System.out.println(stud);
		stud.display();
	}

}
