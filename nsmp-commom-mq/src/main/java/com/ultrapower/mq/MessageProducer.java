package com.ultrapower.mq;

import com.ultrapower.utils.SerializeUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MessageProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(){
        Map<String,Object> message = new HashMap<String,Object>();
        message.put("id",1001);
        message.put("code",2002);
        message.put("tel","13111111111");

        System.out.println("消息发布端：");
        amqpTemplate.convertAndSend("queueTestKey",SerializeUtil.serialize(message));
    }

}
