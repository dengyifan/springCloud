package com.yifan.spring.cloud.feign.api.service;

import com.yifan.spring.cloud.feign.api.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @version V1.0
 * @Title: HelloService
 * @Package: com.yifan.spring.cloud.feign.api.service
 * @Description:
 * @author: dengyin
 * @date: 18-1-3
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
