package com.yifan.spring.cloud.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Title: TraceTwoController
 * @Package: com.yifan.spring.cloud.sleuth.controller
 * @Description:
 * @author: dengyin
 * @date: 18-1-12
 */
@RestController
public class TraceTwoController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        logger.info("====call trace-2====");
        return "Trace";
    }
}
