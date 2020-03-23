package com.lhr13.first_springboot_lhr13.controller;

import com.lhr13.first_springboot_lhr13.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

@RestController
@Component
public class ProducerController {

    @Autowired
    private JmsMessagingTemplate jmt;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @GetMapping("/sentQ")
    public void setQueue(Book book) {
        this.jmt.convertAndSend(this.queue, book);
    }

    @GetMapping("/sentT")
    public void setTopic(Book book) {
        this.jmt.convertAndSend(this.topic, book);
    }
}
