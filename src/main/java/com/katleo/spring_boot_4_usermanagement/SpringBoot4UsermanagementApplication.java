package com.katleo.spring_boot_4_usermanagement;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBoot4UsermanagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot4UsermanagementApplication.class, args);

		for (String s : ac.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

	@GetMapping("/")
	String hello(){
		return "Hi from main  app";
	}
}
