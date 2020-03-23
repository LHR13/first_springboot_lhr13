package com.lhr13.first_springboot_lhr13.controller;

import com.lhr13.first_springboot_lhr13.bean.Book;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Customer1Controller {
    @JmsListener(destination = "amq.queue")
    public void get1Q(Book book) {
        System.out.println("消费者1接收到Queue消息" + book.toString());
    }

    @JmsListener(destination = "amq.topic")
    public void get1T(Book book) {
        System.out.println("消费者1接收到Topic消息" + book.toString());
    }
}
