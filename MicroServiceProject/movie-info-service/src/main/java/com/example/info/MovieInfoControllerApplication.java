package com.example.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieInfoControllerApplication {
	@Bean
	public RestTemplate getRestTemplate() {
		System.out.println("bean of rest template");
		return new RestTemplate() ;
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MovieInfoControllerApplication.class, args);
	}

}