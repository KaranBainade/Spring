package com.curd.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.curd.cfgs.RootAppConfig;
import com.curd.cfgs.WebMvcAppConfig;

public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("MyWebApplicationInitializer.getRootConfigClasses()");
		return new Class[] {RootAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("MyWebApplicationInitializer.getServletConfigClasses()");
		return new Class[] {WebMvcAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("MyWebApplicationInitializer.getServletMappings()");
		return new String[] {"*.htm"};
	}

}
