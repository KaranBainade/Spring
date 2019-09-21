package com.java.gof.singletonpatterns;

public class Printer extends SingletonBreakerUsingCloning {
	private static Printer printer ;
	
	private Printer() {
		if(printer != null){
			throw new InstantiationError("Already there");
		}
	}
	
	public static Printer getIntance() {
		if(printer == null) {
			synchronized (Printer.class) {
				if(printer == null) {
					printer =  new Printer();
				}
			}
		}
		return printer;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
