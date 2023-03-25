package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //when we change bean name student to other so we apply @Component("name of object you want from this class") 
@Scope("prototype")
public class Student {
	@Value("Durgesh")
	private String studentName;
	@Value("Meerut")
	private String city ;
	@Value("#{temp}") //@Value("#{id of standalone collection which is declare in the xml file }")
	private List<String> phone_numbers;
	public List<String> getPhone_numbers() {
		return phone_numbers;
	}
	public void setPhone_numbers(List<String> phone_numbers) {
		this.phone_numbers = phone_numbers;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	

}
