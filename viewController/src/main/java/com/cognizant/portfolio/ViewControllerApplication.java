package com.cognizant.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ViewControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewControllerApplication.class, args);
	}

}
