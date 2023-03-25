package com.springcore.collec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collec/SprConfigcollec.xml");
	Emp emp1 =	(Emp)context.getBean("emp1");
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getAddresses());
	System.out.println(emp1.getCourses());
	//System.out.println(emp1.getPhones().getClass().getName());
	

	}

}
