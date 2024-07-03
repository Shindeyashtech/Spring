package com.example.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

		// TODO Auto-generated constructor stub
	@Autowired
		Laptop lap =null;
	
	public void build () {
		
		System.out.println("dev");
		lap.complile();
	}
	}
	


