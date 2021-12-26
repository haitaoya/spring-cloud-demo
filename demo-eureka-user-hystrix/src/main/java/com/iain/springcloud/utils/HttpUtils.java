package com.iain.springcloud.utils;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpUtils {
    @Bean
    @LoadBalanced//开启负载均衡 默认是轮询  Ribbon
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
