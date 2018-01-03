package com.yifan.spring.cloud.feign.controller;

import com.yifan.spring.cloud.feign.dto.User;
import com.yifan.spring.cloud.feign.service.HelloService;
import com.yifan.spring.cloud.feign.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Title: ConsumerController
 * @Package: com.yifan.spring.cloud.feign.controller
 * @Description:
 * @author: dengyin
 * @date: 18-1-3
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String hello() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("DIDI")).append("\n");
        sb.append(helloService.hello("DIDI", 30)).append("\n");
        sb.append(helloService.hello(new User("DIDI", 30))).append("\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("miao")).append("\n");
        sb.append(refactorHelloService.hello("miao", 30)).append("\n");
        sb.append(refactorHelloService.hello(new com.yifan.spring.cloud.feign.api.dto.User("miao", 31))).append("\n");
        return sb.toString();
    }
}
