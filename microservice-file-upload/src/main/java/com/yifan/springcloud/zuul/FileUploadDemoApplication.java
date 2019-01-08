package com.yifan.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FileUploadDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadDemoApplication.class, args);
    }
}
