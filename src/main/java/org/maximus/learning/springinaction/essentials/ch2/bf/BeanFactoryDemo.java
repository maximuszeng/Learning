package org.maximus.learning.springinaction.essentials.ch2.bf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class BeanFactoryDemo {
	
	public void getBean() {
		
	}
	
	public void getFactory() throws BeansException, FileNotFoundException {
		
		InputStream beanXml = new FileInputStream("beans.xml");
		
		BeanFactory factory = new XmlBeanFactory(beanXml);
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
