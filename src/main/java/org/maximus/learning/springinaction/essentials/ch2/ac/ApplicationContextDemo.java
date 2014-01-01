package org.maximus.learning.springinaction.essentials.ch2.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextDemo {

	private ApplicationContext context;

	/**
	 * ClassPathXmlApplicationContext
	 */
	public SayHello getBeanFromClassPath() {

		context = new ClassPathXmlApplicationContext("beans.xml");
		SayHello sayHello1 = (SayHello) context.getBean("sayHello1");
		return sayHello1;
	}

	/**
	 * FileSystemXmlApplicationContext
	 */
	public SayHello getBeanFromFileSystem() {

		context = new FileSystemXmlApplicationContext(
		        "file:/Users/maximuszeng/code/github/Learning/src/main/resources/beans.xml");
		SayHello sayHello2 = (SayHello) context.getBean("sayHello2");
		return sayHello2;
	}

	/**
	 * XmlWebApplicationContext
	 */
	public void getBeanFromXmlWeb() {
		// no demo.
	}
	
	
	public static void main(String[] args) {
		
		ApplicationContextDemo demo = new ApplicationContextDemo();
		
		SayHello sayHello1 = demo.getBeanFromClassPath();
		sayHello1.say();
		
		System.out.println("-----------");
		
		SayHello sayHello2 = demo.getBeanFromFileSystem();
		sayHello2.say();
		
	}
}
