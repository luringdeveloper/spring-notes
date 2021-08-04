package com.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.College;

public class Test {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	new AnnotationConfigApplicationContext(AppConfig.class);
	College college=(College)applicationContext.getBean("getCollege");
	System.out.println(college.getTeacher().getName());
	}
}
