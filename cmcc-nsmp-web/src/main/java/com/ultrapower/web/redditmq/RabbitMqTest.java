package com.ultrapower.web.redditmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-rabbitmq.xml")
public class RabbitMqTest {

    @Autowired
    MessageProducer messageProducer;

    @Test
    public void testProducer(){
      Object message = "{'id':1001,'oid':20180801,'tel':'13100009999'}";
      messageProducer.sendMessage(message);
    }
}
