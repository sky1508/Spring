package com.myspring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring/spring.xml"));
		Triangle triangle = (Triangle) context.getBean("triangle");
		//Creating object using alias
		Triangle triangle2 = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
		triangle2.draw();
	}

}
