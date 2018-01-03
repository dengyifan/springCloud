package com.yifan.spring.cloud.monkey.controller;

import com.yifan.spring.cloud.monkey.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/hello")
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:{} ,sevice_id:{}", instance.getHost(), instance.getServiceId());
        return "Hello World";
    }

    @RequestMapping("/uuid")
    public String uuid() {
        return id;
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
