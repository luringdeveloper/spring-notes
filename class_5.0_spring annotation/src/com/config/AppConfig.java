package com.config;



import java.sql.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
@ComponentScan(basePackages = {"com"})
public class AppConfig {
	
	@Bean
	public Student getStudent() {
		return  new Student();
	}

	@Bean
	public Date getDate() {
		return  new Date(System.currentTimeMillis());
	}
}
