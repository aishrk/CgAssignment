package com.example.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class MoviesCatalogServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		System.out.println("bean of resttemplate");
		return new RestTemplate() ;
		
	}
	
	@Bean
	public WebClient.Builder getWebclientBuilder() {
		System.out.println("bean of webClient Builder");
		return WebClient.builder() ;
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MoviesCatalogServiceApplication.class, args);
	}

}