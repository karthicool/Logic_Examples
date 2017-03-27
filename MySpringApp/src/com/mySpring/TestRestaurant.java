package com.mySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("appConfig.xml");
/*Restuarant resObj=(Restuarant) context.getBean("resrtaurantBean");
//resObj.displayWaitersList();
resObj.setWelcome("Welcome to Spring World");
System.out.println("From ResObj"+resObj.getWelcome());
Restuarant resObj2=(Restuarant) context.getBean("resrtaurantBean");
System.out.println("From ResObj2"+resObj2.getWelcome());*/

Customer cusObj= (Customer)context.getBean("customerBean");
cusObj.displayCustomer();
	}

}
