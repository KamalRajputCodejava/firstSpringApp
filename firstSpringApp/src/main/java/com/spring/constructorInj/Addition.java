package com.spring.constructorInj;

public class Addition {
private int a ;
private int b ;
 
public Addition(double a ,double b) { //constructor overloading;  // constructor injection by springconfig mein orderwise values aata hai jo pela constructore hoga use value pehle asigh hogi ;
	  this.a = (int)a ;
	  this.b = (int)b;
	  System.out.println("Constructor :double, double");
	 }
public Addition(int a , int b ) {
	  this.a = a ;
	  this.b = b ;
	  System.out.println("Constructor   : int ,int ");
	  System.out.println(this.a + " : a ki value");
	  System.out.println("b ki value : "+ this.b);
	  
	  
  }
public Addition(String a , String b) { //lekin agar String Args Constuctorv ahi to vo hi pehle call hoga ;
	  this.a = Integer.parseInt(a);
	  this.b = Integer.parseInt(b);
	  System.out.println("constructor String call  : String ,String " );
	  
}
  
  public void doSum() {
	  System.out.println("Sum is ="+(this.a +this.b));
	  
  }
}
