package com.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config.xml");
	//insert
//	Object object=applicationContext.getBean("student");
//	Student student=(Student)object;
	StudentDao studentDao= (StudentDao)applicationContext.getBean("studentdao");
//	System.out.println(studentDao.insert(student));   
	
	System.out.println(studentDao.delete(2));
	
//	Student student=applicationContext.getBean(Student.class);
//	StudentDao studentDao= applicationContext.getBean(StudentDao.class);
//	System.out.println(studentDao.insert(student));   
	}
}
