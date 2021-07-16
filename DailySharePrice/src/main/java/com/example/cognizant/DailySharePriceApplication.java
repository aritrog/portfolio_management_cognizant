package com.example.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableEurekaClient
public class DailySharePriceApplication {

	static Logger logger = LoggerFactory.getLogger(DailySharePriceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DailySharePriceApplication.class, args);
		logger.info("In DailySharePriceApplication");

	}

}
