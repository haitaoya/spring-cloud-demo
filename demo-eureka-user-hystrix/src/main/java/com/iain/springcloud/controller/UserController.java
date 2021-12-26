package com.iain.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOrderByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String findOrderByUser(@PathVariable String id) {
        int oid = 123;
        return restTemplate.getForObject("http://demo-eureka-order/order/" + oid, String.class);
    }

    public String fallbackMethod(@PathVariable String id) {
        return "服务不可用啦！！！！！！！！！请稍后再试~~~~";
    }
}
