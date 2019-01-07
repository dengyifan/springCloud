package com.yifan.spring.cloud.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
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

    public static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://MONKEY/hello", String.class).getBody();
    }

    @GetMapping("/log-instance")
    public void logMonkeyInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("MONKEY");

        //打印当前选择的是哪个节点
        logger.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }
}
