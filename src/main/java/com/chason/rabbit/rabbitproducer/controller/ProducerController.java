package com.chason.rabbit.rabbitproducer.controller;

import com.chason.rabbit.rabbitproducer.send.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chason on 2018/3/30.14:40
 */
@RestController
public class ProducerController {
    @Autowired
    private SendService sendService;

    @GetMapping("sendMy")
    public String sendMyRequest(){
        // 创建消息
        Message msg = MessageBuilder.withPayload("Hello Word!".getBytes()).build();
        // 发送消息
        sendService.sendOrderMy().send(msg);
        return "SUCCESS";
    }

    @GetMapping("sendYour")
    public String sendYourRequest(){
        // 创建消息
        Message msg = MessageBuilder.withPayload("Hello Word!".getBytes()).build();
        // 发送消息
        sendService.sendOrderYour().send(msg);
        return "SUCCESS";
    }
}
