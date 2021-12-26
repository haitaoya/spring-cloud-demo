package com.iain.springcloud.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Order {
    private String id;
    private Double price;
    private String receiveName;
    private String receiveAddress;
    private String receivePhone;
}
