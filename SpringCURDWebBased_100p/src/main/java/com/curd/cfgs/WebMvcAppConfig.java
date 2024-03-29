package com.curd.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.curd.controller")
@EnableWebMvc
public class WebMvcAppConfig {
	
	
	@Bean
	public  ViewResolver  createIRVR() {
		return  new InternalResourceViewResolver("/WEB-INF/pages/",".jsp");
	}

}
