package com.cognizant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.cognizant.model.MyUser;
import com.cognizant.repository.UserRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableEurekaClient
//@EnableSwagger2
public class JwtAuthenticationApplication {

	

	@Autowired
    private UserRepository userRepository;
	
	
	static Logger logger = LoggerFactory.getLogger(JwtAuthenticationApplication.class);

    @PostConstruct
    public void initUsers() {
        List<MyUser> users = Stream.of(
               new MyUser("1","Aritra","12345678"),
               new MyUser("2","Keshore","12345678"),
               new MyUser("3","Sonu","12345678"),
               new MyUser("4","Jeenath","12345678")
        ).collect(Collectors.toList());
        userRepository.saveAll(users);
    }
	
	

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationApplication.class, args);
		logger.info("Authentication module started successfully");
	}

}
