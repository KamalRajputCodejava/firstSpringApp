package com.kamal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
 
     
     
     
   
            public static void main( String[] args )
            {
                System.out.println( "Hello World!" );
                       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SprConfig.xml");
                       Object student1 = context.getBean("student1");
                       Object student2 = context.getBean("student2");
                      // Object student3 =context.getBean("student3");
                       
                System.out.println(student1+"\n"+student2);
            }
        

    }

