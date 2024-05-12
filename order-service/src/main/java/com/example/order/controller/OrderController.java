package com.example.order.controller;

import com.example.order.config.Config;
import com.example.order.model.Customer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderController {

    @RabbitListener(queues = Config.QUEUE)
    public void consume(Customer customer){
        System.out.println(customer.getName()+ "  " +customer.getCity()+ "  " +customer.getPhone());
    }
}
