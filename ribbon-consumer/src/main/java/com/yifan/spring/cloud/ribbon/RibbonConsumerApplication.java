package com.yifan.spring.cloud.ribbon;

import com.yifan.spring.cloud.ribbon.service.IHelloService;
import com.yifan.spring.cloud.ribbon.service.impl.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker // 开启断路器功能
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {

	@Bean
	@LoadBalanced //该注解开启客户端负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	IHelloService helloService() {
		return new HelloService();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}
}
