package com.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


import com.config.handlingMapping;

//replacement of web.xml
public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] { handlingMapping.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
