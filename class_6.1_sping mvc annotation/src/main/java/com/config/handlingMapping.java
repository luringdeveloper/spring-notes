package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com")
@EnableWebMvc
public class handlingMapping {

	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
	}
}
