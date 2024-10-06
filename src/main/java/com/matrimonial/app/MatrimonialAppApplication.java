package com.matrimonial.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.matrimonial")
@EntityScan("com.matrimonial")
public class MatrimonialAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrimonialAppApplication.class, args);
	}

}
