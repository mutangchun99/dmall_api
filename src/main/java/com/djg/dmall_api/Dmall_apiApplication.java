package com.djg.dmall_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.djg.dmall_api.controller"})
public class Dmall_apiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dmall_apiApplication.class, args);
	}

}
