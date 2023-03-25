package com.spring.springExpressionLanguage;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpEL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  ApplicationContext  context = new ClassPathXmlApplicationContext("com/spring/springExpressionLanguage/SprConfigSpEL.xml");
          DemoSpEL dspl =context.getBean("demoSpEL", DemoSpEL.class);
          System.out.println(dspl);
          System.out.println("______________SpELExpressionParser class used__________________________________________________");
              SpelExpressionParser temp  =  new SpelExpressionParser();
              org.springframework.expression.Expression exp  =temp.parseExpression("50+60");
              System.out.println(exp.getValue());
	}
 
}
