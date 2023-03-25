package com.spring.standalon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandAloneCollec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/standalon/collection/SprConfigAloneCollec.xml");
		  Person p1 = con.getBean("person1",Person.class);
		  System.out.println(p1);

		  System.out.println(p1.getFriends().getClass().getName()); //for printing the class litrel
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  System.out.println(p1.getFeestructure());
		  System.out.println(p1.getFeestructure().getClass().getName());
		  System.out.println("_____________________________________________________________________________________________");
		  System.out.println(p1.getProperties());
		  
	}

}
