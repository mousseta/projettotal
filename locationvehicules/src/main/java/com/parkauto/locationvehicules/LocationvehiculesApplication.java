package com.parkauto.locationvehicules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LocationvehiculesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationvehiculesApplication.class, args);
	}

}
