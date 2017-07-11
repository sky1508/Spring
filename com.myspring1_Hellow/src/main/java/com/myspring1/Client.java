package com.myspring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("hello");
		obj.show();

	}
}
