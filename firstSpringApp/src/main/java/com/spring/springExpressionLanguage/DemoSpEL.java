package com.spring.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class DemoSpEL {
	@Value("#{125+125}")
	private int x; 
	@Value("#{50}")   // this is the Spring Expression language in the #{} ; 
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}") //Sysntax to invoke the Static methods and Static variables in the SpEL ;
	private double z ;
	@Value("#{T(java.lang.Math).PI}")
	private double pi ;
	@Value("#{new java.lang.String('Kamal Rajput')}")
	private String name ; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "DemoSpEL [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + "]";
	}
	public DemoSpEL() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
