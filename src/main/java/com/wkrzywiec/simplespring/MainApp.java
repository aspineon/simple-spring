package com.wkrzywiec.simplespring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigApp.class);
		context.refresh();
		
		Person john = (Person) context.getBean("john");
		System.out.println("\n" + john.sayHello() + "\n");
		
		context.close();
	}

}
