package com.chason.rabbit.rabbitproducer;

import com.chason.rabbit.rabbitproducer.send.SendService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

// @EnableBinding 以SendService.class作为参数，spring容器启动时，自动绑定sendService中的通道
@EnableBinding(SendService.class)
@SpringBootApplication
@EnableEurekaClient
public class RabbitProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitProducerApplication.class, args);
	}
}

