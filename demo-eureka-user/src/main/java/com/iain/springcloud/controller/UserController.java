package com.iain.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${clientParam}")
    private String clientParam;


    @RequestMapping("/clientParam")
    public String getClientName() {
        return "hello " + clientParam;
    }

    @GetMapping("/findOrderByUser/{id}")
    public String findOrderByUser(@PathVariable String id) {
        int oid = 123;
//        return restTemplate.getForObject("http://localhost:7900/order/" + oid, String.class);
        return restTemplate.getForObject("http://demo-eureka-order/order/" + oid, String.class);

    }

}
