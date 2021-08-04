package com.control;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext= new ClassPathXmlApplicationContext("spring_config.xml");
		Object object=abstractApplicationContext.getBean("student");
		Student student=(Student)object;
		System.out.print(
				student.getName()+"\t"+
				student.getAddress().getState()+"\t");
	
		//list
		
		student.getCertificates().stream().forEach(stud->System.out.print(stud.getCertificate_name()+"\t"));
		System.out.println("\n");
		
		//set
		System.out.println(student.getGame_collections());
		
		//map
		System.out.println(student.getMap());
		
		
		//destroy
		abstractApplicationContext.registerShutdownHook();
	}
		
}
