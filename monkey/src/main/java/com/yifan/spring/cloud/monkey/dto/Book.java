package com.yifan.spring.cloud.monkey.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version V1.0
 * @Title: Book
 * @Package: com.yifan.spring.cloud.monkey.dto
 * @Description: 如何使用配置文件里的参数
 * @author: dengyin
 * @date: 17-11-17
 */
@Component
public class Book {

    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

    @Value("${book.desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
