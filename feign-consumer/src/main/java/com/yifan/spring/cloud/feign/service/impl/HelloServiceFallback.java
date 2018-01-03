package com.yifan.spring.cloud.feign.service.impl;

import com.yifan.spring.cloud.feign.dto.User;
import com.yifan.spring.cloud.feign.service.HelloService;

/**
 * @version V1.0
 * @Title: HelloServiceFallback
 * @Package: com.yifan.spring.cloud.feign.service
 * @Description: 对于 @FeignClient 接口服务的 服务降级实现
 * @author: dengyin
 * @date: 18-1-3
 */
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    /**
     * 这里 一 定要注意，在定义各参数绑定时，@RequestParam、@RequestHeader 等可
     * 以指定参数名称的注解， 它们的 value 千万不能少。 在 SpringMVC 程序中， 这些注解会根
     * 据参数名来作为默认值，但是在Feign 中绑定参数必须通过 value 属性来指明具体的参数名，
     * 不然会抛出口legalStateException 异常， value 属性不能为空
     *
     * @param name
     * @return
     */
    @Override
    public String hello(String name) {
        return "error";
    }

    /**
     * 这里 一 定要注意，在定义各参数绑定时，@RequestParam、@RequestHeader 等可
     * 以指定参数名称的注解， 它们的 value 千万不能少。 在 SpringMVC 程序中， 这些注解会根
     * 据参数名来作为默认值，但是在Feign 中绑定参数必须通过 value 属性来指明具体的参数名，
     * 不然会抛出口legalStateException 异常， value 属性不能为空
     *
     * @param name
     * @param age
     * @return
     */
    @Override
    public User hello(String name, Integer age) {
        return new User("error",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
