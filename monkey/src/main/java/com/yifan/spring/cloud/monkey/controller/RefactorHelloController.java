package com.yifan.spring.cloud.monkey.controller;

import com.yifan.spring.cloud.feign.api.dto.User;
import com.yifan.spring.cloud.feign.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Title: RefactorHelloController
 * @Package: com.yifan.spring.cloud.monkey.controller
 * @Description:
 * @author: dengyin
 * @date: 18-1-3
 */
@RestController
public class RefactorHelloController implements HelloService{

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
