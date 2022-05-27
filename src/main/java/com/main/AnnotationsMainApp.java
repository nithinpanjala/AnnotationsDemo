package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.Address;

public class AnnotationsMainApp {

	public static void main(String[] args) {
		// load XML in general by ApplicationContext
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				com.config.MyAnnotationsConfig.class);
		Address address = (Address) applicationContext.getBean("address");
		System.out.println(address.getDoorNo());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println("the end");


	}

}
