package com.yifan.spring.cloud.bus.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @version V1.0
 * @Title: Sender
 * @Package: com.yifan.spring.cloud.bus.rabbitmq
 * @Description:
 * @author: dengyin
 * @date: 18-1-11
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
