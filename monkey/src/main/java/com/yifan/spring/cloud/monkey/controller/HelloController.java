package com.yifan.spring.cloud.monkey.controller;

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

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
