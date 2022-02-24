package com.djg.dmall_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.djg"})
@MapperScan(basePackages = {"com.djg.dmall_api.dao"})
public class Dmall_apiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dmall_apiApplication.class, args);
	}

}
