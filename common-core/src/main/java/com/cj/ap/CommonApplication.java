package com.cj.ap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cj.ap")
public class CommonApplication {
	
	
	public static void main(String []args) {
		SpringApplication.run(CommonApplication.class, args);
	}

}
