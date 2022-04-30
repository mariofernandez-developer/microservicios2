package com.wannacode.bookingmicroservide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookingMicroservideApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroservideApplication.class, args);
	}

}
