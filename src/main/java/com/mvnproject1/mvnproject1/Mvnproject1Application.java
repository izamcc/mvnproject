package com.mvnproject1.mvnproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mvnproject1Application {
	public static void main(String[] args) {
		SpringApplication.run(Mvnproject1Application.class, args);	}

	@GetMapping
	public String hello() { return "ZAIN KSA !!! ";}

}
