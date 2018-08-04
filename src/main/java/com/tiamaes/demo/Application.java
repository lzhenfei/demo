package com.tiamaes.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiamaes.demo.model.User;
import com.tiamaes.demo.service.UserService;
@SpringBootApplication
@MapperScan("com.tiamaes.demo.mapper")
public class Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
