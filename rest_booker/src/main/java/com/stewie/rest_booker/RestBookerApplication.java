package com.stewie.rest_booker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RestBookerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBookerApplication.class, args);
	}

}
