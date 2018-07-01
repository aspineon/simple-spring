package com.wkrzywiec.simplespring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("john")
public class Person {

	@Value("John")
	private String name;
	
	public String sayHello() {
		
		return "Hi, my name is: " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
