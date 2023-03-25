package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp2") //use to inject the perticular bean in the dependent class object ;
	private Address address ;

	public Address getAddress() {
		return address;
	}
    // @Autowired //setter ya constructor ya fir property ke uper bhi laga sakte hain is annotation ko //
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	


}
