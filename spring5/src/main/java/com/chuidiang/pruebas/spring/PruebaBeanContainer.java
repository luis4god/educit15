package com.chuidiang.pruebas.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class PruebaBeanContainer {

	public static void main(String[] args) {
		Resource resource = new FileSystemResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println(factory.getBean("Juan"));
		System.out.println(factory.getBean("Pedro"));
	}
}