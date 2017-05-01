package com.csz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SchweizerMesserApplication {

	public static void main(String[] args) {
		System.out.print("这是Spring boot start ~");
		SpringApplication.run(SchweizerMesserApplication.class, args);
	}
}
