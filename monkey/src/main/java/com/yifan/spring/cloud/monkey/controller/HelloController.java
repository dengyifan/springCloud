package com.yifan.spring.cloud.monkey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Title: HelloController
 * @Package: com.yifan.spring.cloud.monkey.controller
 * @Description:
 * @author: dengyin
 * @date: 17-11-17
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @Value("${com.yifan.spring.cloud.properties.random.uuid}")
    private String id;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/uuid")
    public String uuid() {
        return id;
    }
}
