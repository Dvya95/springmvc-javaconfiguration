package com.spring.mvc.practice.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class []cArr= {AppConfig.class};
		return cArr;
	}

	@Override
	protected String[] getServletMappings() {
		String sarr[]={"/"};
		return sarr;
	}

}
