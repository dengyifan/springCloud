package com.yifan.spring.cloud.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class MonkeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonkeyApplication.class, args);
	}
}
