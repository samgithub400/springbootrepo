package com.ios;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootWithAwsApplication {

	public static void main(String[] args) {
		
		System.out.println("Welcome TO The Spring Boot App With AWS..!");
		log.info("Spring Boot With AWS App Started...!");
		SpringApplication.run(SpringbootWithAwsApplication.class, args);
	}

}
