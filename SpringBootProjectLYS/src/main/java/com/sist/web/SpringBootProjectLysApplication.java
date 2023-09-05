package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sist.web.controller"})
public class SpringBootProjectLysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectLysApplication.class, args);
	}

}
