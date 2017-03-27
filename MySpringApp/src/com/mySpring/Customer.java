package com.mySpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {

	private String customer_Name;

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	
	public void displayCustomer()
	{
		System.out.println("Welcome "+customer_Name);
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Executing before Creating");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Executing before destroying");
	}
}
