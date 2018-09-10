package com.DarkMario.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DmBlogApplication {
	
	public static void main(String[] args) {
		System.out.println("开始部署");
		SpringApplication.run(DmBlogApplication.class, args);
	}
}
