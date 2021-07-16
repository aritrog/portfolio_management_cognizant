package com.example.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
public class CalculateNetworthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculateNetworthApplication.class, args);
		Logger logger = LoggerFactory.getLogger(CalculateNetworthApplication.class);
		logger.info("In CalculateNetworthApplication Class at main() method");
	}

}
