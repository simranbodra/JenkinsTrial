package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsTrialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTrialApplication.class, args);
	}
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello....";
	}
}
