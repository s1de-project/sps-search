package com.sideproject.spssearch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpsSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpsSearchApplication.class, args);
	}
	@GetMapping("/search/info")
    public String info(@Value("${server.port}") String port) {
        return "this is search";
    }

}
