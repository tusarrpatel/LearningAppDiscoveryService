package com.trp.learningapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearningAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningAppDiscoveryServiceApplication.class, args);
	}

}
