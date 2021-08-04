package com.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Address;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
		//Student student=(Student)applicationContext.getBean(Student.class);
		Student student=(Student)applicationContext.getBean("getStudent");
		//System.out.println(student);
		
		//System.out.println(applicationContext.getBean("getDate"));
		
		Address address=(Address)applicationContext.getBean("address");
		address.setState("U.P");

		System.out.println(student.getAddress().getState()+"\t"+student.getRoll());
	}
	
}
