package com.chason.rabbit.rabbitproducer.send;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by chason on 2018/3/30.11:47
 */
public class Send {
    public static void main(String[] args)  throws Exception{
        // 创建连接
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();

        // 建立通道
        Channel channel = connection.createChannel();
        // 声明队列
        String queueName = "hello";
        channel.queueDeclare(queueName,false,false,false,null);
        String msg = "Hello Word!";

        for (int i = 0;i<10;i++){
            // 进行消息发布
            channel.basicPublish("",queueName,null,(msg+i).getBytes());
            Thread.sleep(3000);
        }


        // 关闭通道和连接
        channel.close();
        connection.close();
    }
}
