package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KicksInventoryApplication {
	public static void main(String[] args) {
		SpringApplication.run(KicksInventoryApplication.class, args);
	}
}
