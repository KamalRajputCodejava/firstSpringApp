package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/stereotype/SprConfigStereo.xml");
	Student s1= con.getBean("student",Student.class);
       System.out.println(s1);
       System.out.println("_______________________________________________________________________________________________");
       System.out.println(s1.getPhone_numbers());
	   System.out.println(s1.hashCode());
	   
	   Student s2 =   con.getBean("student" ,Student.class);
	   System.out.println(s2.hashCode());  // same object return by container this is singleton  bean scope; for other scope we use annotation @Scope("") followed by @Component;
	   TeacherXmlScope  txs = (TeacherXmlScope)con.getBean("teacher");
	   System.out.println(txs.hashCode());
	   System.out.println("__________________________________________________________________________________________________");
	   TeacherXmlScope txs1 = (TeacherXmlScope)con.getBean("teacher");
	   System.out.println(txs1.hashCode());
         
	}

}
