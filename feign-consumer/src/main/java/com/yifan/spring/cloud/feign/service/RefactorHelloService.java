package com.yifan.spring.cloud.feign.service;

import com.yifan.spring.cloud.feign.api.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @version V1.0
 * @Title: RefactorHelloService
 * @Package: com.yifan.spring.cloud.feign.service
 * @Description:
 * @author: dengyin
 * @date: 18-1-3
 */
@FeignClient(value = "monkey")
public interface RefactorHelloService extends HelloService{
}
