package com.spring.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosaPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext conts=  new ClassPathXmlApplicationContext("com/spring/lifecycle/SprConfigSamosa.xml");
//		    Samosa s1=(Samosa)conts.getBean("s1");
//		    System.out.println(s1);
      //	    registring  the shutdown hook ;
            conts.registerShutdownHook(); //for the destroy method;
//            System.out.println("=============================================================================================");
//            Pepsi p1 = (Pepsi)conts.getBean("pes");
//            System.out.println(p1);
              Pizza pz = (Pizza)conts.getBean("pz1");
              System.out.println(pz);
	}

}
