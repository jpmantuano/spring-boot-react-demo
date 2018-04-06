package com.springboot.reactdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.springboot.reactdemo")
public class ReactDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReactDemoApplication.class, args);
	}
}
