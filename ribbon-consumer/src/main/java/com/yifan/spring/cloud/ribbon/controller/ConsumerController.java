package com.yifan.spring.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version V1.0
 * @Title: ConsumerController
 * @Package: com.yifan.spring.cloud.ribbon.controller
 * @Description: 通过 ribbon 实现服务消费
 * @author: dengyin
 * @date: 18-1-2
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://MONKEY/hello", String.class).getBody();
    }
}
