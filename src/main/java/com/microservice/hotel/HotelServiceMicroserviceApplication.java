package com.microservice.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelServiceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceMicroserviceApplication.class, args);
	}

}
