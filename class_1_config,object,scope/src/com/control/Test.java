package com.control;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.model.Student;

public class Test {
public static void main(String[] args) {
	//ClassPathResource classPathResource=new ClassPathResource("spring_config.xml");
	//BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	
//ApplicationContext applicationContext	=new ClassPathXmlApplicationContext("spring_config.xml");
//Object object= applicationContext.getBean("student");
//Student student=(Student)object;
//student.setName("ajay pal");
//System.out.println(student.getName());

//ApplicationContext applicationContext	=new ClassPathXmlApplicationContext("spring_config.xml");
//Object object= applicationContext.getBean("student1");
//Student student=(Student)object;
//System.out.println(student.getName());

	ApplicationContext applicationContext	=new ClassPathXmlApplicationContext("spring_config.xml");
	Object object= applicationContext.getBean("student1");
	Student student=(Student)object;
	System.out.println(student.getName());
	System.out.println(student.getAddress().getAddress());
	
	System.out.println(student+"\t"+ student.getAddress());
	
	Object object1= applicationContext.getBean("student1");
	Student student1=(Student)object1;
	System.out.println(student1+"\t"+ student1.getAddress() +"\n"+student1.getCollege_name());

	

}
}
