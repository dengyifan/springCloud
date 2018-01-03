package com.yifan.spring.cloud.feign.service;

import com.yifan.spring.cloud.feign.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @version V1.0
 * @Title: HelloService
 * @Package: com.yifan.spring.cloud.feign.service
 * @Description:
 * @author: dengyin
 * @date: 18-1-3
 */
@FeignClient("monkey")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();


    /**
     * 这里 一 定要注意，在定义各参数绑定时，@RequestParam、@RequestHeader 等可
     * 以指定参数名称的注解， 它们的 value 千万不能少。 在 SpringMVC 程序中， 这些注解会根
     * 据参数名来作为默认值，但是在Feign 中绑定参数必须通过 value 属性来指明具体的参数名，
     * 不然会抛出口legalStateException 异常， value 属性不能为空
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    /**
     * 这里 一 定要注意，在定义各参数绑定时，@RequestParam、@RequestHeader 等可
     * 以指定参数名称的注解， 它们的 value 千万不能少。 在 SpringMVC 程序中， 这些注解会根
     * 据参数名来作为默认值，但是在Feign 中绑定参数必须通过 value 属性来指明具体的参数名，
     * 不然会抛出口legalStateException 异常， value 属性不能为空
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
