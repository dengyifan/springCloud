package com.yifan.spring.cloud.monkey.controller;

import com.yifan.spring.cloud.monkey.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @Title: BookController
 * @Package: com.yifan.spring.cloud.monkey.controller
 * @Description: 配置文件里参数获取示例
 * @author: dengyin
 * @date: 17-11-17
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private Book book;

    @RequestMapping("/init")
    public String index() {
        return book.getName() + ", " + book.getAuthor() + ", " + book.getDesc();
    }
}
