package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/demo/config.xml");
        B a=(B)context.getBean("bref");
        System.out.println(a.getY());
       
	}

}
