package com.example.customer.controller;

import com.example.customer.config.Config;
import com.example.customer.model.Customer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {


   private final RabbitTemplate template;

   @Autowired
   public CustomerController(RabbitTemplate template){
       this.template= template;
   }



    @PostMapping
    public String  save(@RequestBody Customer customer){

        template.convertAndSend(Config.EXCHANGE, Config.ROUTING_KEYS, customer );
        return "ok";
    }
}
