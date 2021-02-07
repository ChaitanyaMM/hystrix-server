package com.hystrixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableDiscoveryClient
public class HystrixServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixServerApplication.class, args);
	}
	
	@GetMapping("/")
	private String sampleHystrix() {
		
		return "Hystrix-service is up!";
	}

}
