package com.curd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	 public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/curd/cfgs/applicationContext.xml");
		 System.out.println(ctx);
	}
}
