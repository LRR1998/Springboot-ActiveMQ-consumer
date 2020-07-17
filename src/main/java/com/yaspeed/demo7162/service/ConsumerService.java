package com.yaspeed.demo7162.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @JmsListener(destination = "ActiveMQQueue",containerFactory = "queueListener")
    public void handleMessage(String name){
        System.out.println("Queue成功接收Name："+name);
    }
    @JmsListener(destination = "ActiveMQTopic" , containerFactory = "topicListener")
    public void topicMsg(String name){
        System.out.println("Topic成功接收Name："+name);
    }
}
