package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.model.College;
import com.model.DeepSir;
import com.model.PunitSir;
import com.model.Teacher;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

	@Bean
	public College getCollege(){
		return new College();
	}
	
	@Bean
	public Teacher getTeacher(){
		return new Teacher();
	}
	
	@Bean
	public DeepSir getDeepSir(){
		return new DeepSir();
	}
	
	@Bean
	@Primary
	public PunitSir getPunitSir(){
		return new PunitSir();
	}
}
