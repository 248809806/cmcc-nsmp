package com.ultrapower.web.redditmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(Object message) {
        System.out.println("消息入队："+message);
        amqpTemplate.convertAndSend("queueTestKey", message);
    }
}

