package com.example.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
 

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
		
			ApplicationContext context = SpringApplication.run(AppApplication.class, args);
			Dev obj = context.getBean(Dev.class);
			obj.build();
	}

}
