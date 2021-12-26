package com.iain.springcloud.controller;

import com.iain.springcloud.po.Order;
import com.iain.springcloud.utils.ServiceInfoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id){
        Order order = new Order();
        order.setId(id);
        order.setPrice(1.1);
        order.setReceiveName("AAA");
        System.out.println(ServiceInfoUtil.getPort());
        return order.toString();
    }
}
