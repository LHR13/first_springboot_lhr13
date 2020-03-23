package com.lhr13.first_springboot_lhr13.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;
import javax.management.Query;

@Configuration
public class JmdConfig {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("amq.queue");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("amq.topic");
    }
}
