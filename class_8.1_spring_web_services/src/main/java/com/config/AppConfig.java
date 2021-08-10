package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.model.Quotes;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com")
@PropertySource(value = "classpath:/application.properties")
public class AppConfig{

	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.class"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.pwd"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.user"));
		System.out.println("datasource: " + dataSource);
		return dataSource;
		
	}
	

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		System.out.println("properties: " + properties);
		return properties;
	}
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean localSessionFactoryBean =new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setHibernateProperties(hibernateProperties());
		localSessionFactoryBean.setAnnotatedClasses(Quotes.class);
		System.out.println("localSessionFactoryBean: " + localSessionFactoryBean);
		return localSessionFactoryBean;
		
	}
	
	@Bean
	public HibernateTransactionManager HibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(localSessionFactoryBean().getObject());
		System.out.println("hibernateTransactionManager :" + hibernateTransactionManager);
		return hibernateTransactionManager;
	}

	
}
