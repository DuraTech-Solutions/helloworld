package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class HelloworldApplication {
	@RequestMapping("/")
	public String helloWorld()
	{
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
