package com.chason.rabbit.rabbitproducer.send;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by chason on 2018/3/30.14:34
 */
public interface SendService {

    // @output设置“myInput”消息通道
    @Output("myInput")
    SubscribableChannel sendOrderMy();

    @Output("yourInput")
    SubscribableChannel sendOrderYour();
}
