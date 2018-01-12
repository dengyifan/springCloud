package com.yifan.spring.cloud.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version V1.0
 * @Title: TraceOneController
 * @Package: com.yifan.spring.cloud.sleuth.controller
 * @Description:
 * @author: dengyin
 * @date: 18-1-12
 */
@RestController
public class TraceOneController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        logger.info("====call trace-1====");
        return restTemplate.getForEntity("http://trace-two/trace-2", String.class).getBody();
    }
}
