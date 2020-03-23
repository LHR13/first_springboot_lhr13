package com.lhr13.first_springboot_lhr13.controller;

import com.lhr13.first_springboot_lhr13.bean.Book;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class Customer2Controller {
    @JmsListener(destination = "amq.queue")
    public void get1Q(Book book) {
        System.out.println("消费者2接收到Queue消息" + book.toString());
    }

    @JmsListener(destination = "amq.topic")
    public void get1T(Book book) {
        System.out.println("消费者2接收到Topic消息" + book.toString());
    }
}
