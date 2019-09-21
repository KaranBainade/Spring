package com.java.gof.singletonpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Thread th = new Thread(new SingletonBreakerThread());
		
		th.start();
		
		for(int i =0 ; i < 10 ; i++) {
			//System.out.println(Printer.getIntance().hashCode());	
		}
		System.out.println(Printer.getIntance().hashCode());
		for(int i =0 ; i < 10 ; i++) {
			//System.out.println(Printer.getIntance().clone().hashCode());	
		}
		
		//load class
		Class c = Class.forName("com.java.gof.singletonpatterns.Printer");
		
		//get all constructors (whether public or private)
		Constructor[] constructors = c.getDeclaredConstructors();
		
		//suppress access check errors
		constructors[0].setAccessible(true);
		for(int i =0 ; i < 10 ; i++) {
			System.out.println(constructors[0].newInstance().hashCode());
		}

		
	}
}
