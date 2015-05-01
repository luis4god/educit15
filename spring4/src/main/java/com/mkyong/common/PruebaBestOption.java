package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaBestOption  {
	
    public static void main( String[] args ) {

    	ApplicationContext context = 
    	   new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});
 
    	BestOption output = (BestOption)context.getBean("OutputHelper");
    	output.generateOutput();
    }
}