package com.yifan.spring.cloud.bus.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @version V1.0
 * @Title: Receiver
 * @Package: com.yifan.spring.cloud.bus.rabbitmq
 * @Description:
 * @author: dengyin
 * @date: 18-1-11
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
