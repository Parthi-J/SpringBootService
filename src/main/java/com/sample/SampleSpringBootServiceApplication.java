package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringBootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootServiceApplication.class, args);
		System.out.println("Service started...");
	}

}
