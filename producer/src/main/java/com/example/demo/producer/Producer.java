package com.example.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    private final String queue = "test-queue";

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(queue, message);
        System.out.println("Message sent to the queue: " + message);
    }
}

