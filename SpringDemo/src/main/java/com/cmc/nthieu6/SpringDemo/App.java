package com.cmc.nthieu6.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringDemo.xml");
    	
//    	Vehicle obj = (Vehicle)context.getBean("bike");
//    	obj.use();
    	
    	Car obj = (Car)context.getBean("car");
    	obj.use();
    	
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    }
}
