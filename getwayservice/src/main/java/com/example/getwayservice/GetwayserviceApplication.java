package com.example.getwayservice;

import jdk.jfr.Enabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;


@SpringBootApplication

@EnableDiscoveryClient

public class GetwayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayserviceApplication.class, args);
	}

}
