package com.spring.refrenceValueInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainRefrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context =new  ClassPathXmlApplicationContext("com/spring/refrenceValueInjection/SprConfigRef.xml");
              A  at =  (A)context.getBean("aref");
              System.out.println(at);
              System.out.println(at.getX());
              System.out.println(at.getOb().getY());
              
	}

}
