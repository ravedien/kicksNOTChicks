package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class KicksServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(KicksServiceApplication.class, args);
	}
	
}
