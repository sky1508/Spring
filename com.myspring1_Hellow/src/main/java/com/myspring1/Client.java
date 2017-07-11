package com.myspring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spring/spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
 
		Object o = factory.getBean("id1");
		HelloWorld wb = (HelloWorld)o;
 
		wb.show();

	}
}
