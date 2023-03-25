package com.spring.autowireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext autocot=new ClassPathXmlApplicationContext("com/spring/autowireing/SprConfigAutoWiring.xml");
		 Emp emp1 =  autocot.getBean("emp1",Emp.class); //self typecast by Emp.class;
		 //Emp emp2 =  autocot.getBean("emp2",Emp.class); //self typecast by Emp.class;
		 System.out.println(emp1);
		// System.out.println(emp2);

	}

}
