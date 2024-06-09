package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.User;

@SpringBootApplication
public class GitDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoProjectApplication.class, args);
		
		System.out.println("Test"); 
		
		User u1 = new User(1L, "Mario", "Rossi", "mRossi", "123");
		System.out.println(u1);
		
	}

}
