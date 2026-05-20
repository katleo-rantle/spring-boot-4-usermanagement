package com.katleo.spring_boot_4_usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBoot4UsermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4UsermanagementApplication.class, args);
	}

	@GetMapping("/")
	String hello(){
		return "Hello, world";
	}
}
