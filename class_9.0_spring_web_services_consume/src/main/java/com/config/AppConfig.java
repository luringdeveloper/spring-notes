package com.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(value = "com")
public class AppConfig implements WebMvcConfigurer{
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	WebMvcConfigurer.super.addResourceHandlers(registry);
	registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
}

@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	WebMvcConfigurer.super.configureViewResolvers(registry);
	registry.jsp("/WEB-INF/views/", ".jsp");
	}

@Bean
public RestTemplate getRestTemplate() {
	return new RestTemplate();
}
}
