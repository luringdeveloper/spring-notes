package com.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
//	ApplicationContext applicationContext	=new ClassPathXmlApplicationContext("spring_config.xml");
//		 Object object =applicationContext.getBean("student");
//		 Student student=(Student)object;
//		 System.out.println(student.getAddress().getState());
//		System.out.println(student.getColl().getColl_name());
//	
		// init
		// ApplicationContext applicationContext =new
		// ClassPathXmlApplicationContext("spring_config.xml");

		// destroy
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		abstractApplicationContext.registerShutdownHook();

	}

}
