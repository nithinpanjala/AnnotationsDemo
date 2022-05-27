package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.Address;

@Configuration	//replacement of XML

@ComponentScan(basePackages = "com.model")
public class MyAnnotationsConfig {
	
}
