package com.ultrapower.mq;

import com.ultrapower.utils.SerializeUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.util.Map;

/*消息接收者*/
public class MessageConsumer implements MessageListener {
    public void onMessage(Message message) {
        //message  接收到的消息
        System.out.println("消息订阅段：");
        byte[] body = message.getBody();
        Map<String,Object> map = (Map<String,Object>)SerializeUtil.unserialize(body);
        System.out.println(map);
    }
}
