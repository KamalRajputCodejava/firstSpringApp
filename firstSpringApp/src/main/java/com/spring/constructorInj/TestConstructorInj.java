package com.spring.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ApplicationContext cont = new ClassPathXmlApplicationContext("com/spring/constructorInj/SprConfigCostuctorInj.xml");
                          Person person=(Person)cont.getBean("Person1");
                          System.out.println(person);
                          Addition add = (Addition) cont.getBean("add");
                          add.doSum();
                          
	}

}
