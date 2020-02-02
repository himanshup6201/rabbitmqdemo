package com.rabbitmq.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner {

    private RabbitTemplate rabbitTemplate;

    public RabbitmqdemoApplication(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //rabbitTemplate.convertAndSend("Hello from our first message");//used to send message to default exchange
        SimpleMessage simpleMessage=new SimpleMessage();
        simpleMessage.setDescription("simple Description");
        simpleMessage.setName("himanshu");
        rabbitTemplate.convertAndSend("MyTopicExchange1","topic", simpleMessage); //send message to customised exchange
    }
}
