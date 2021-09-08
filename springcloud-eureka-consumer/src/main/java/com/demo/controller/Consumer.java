package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("consumer")
    public String consumer(int num){
        return restTemplate.getForObject(getURL("eureka-server","/all"),String.class);
    }

    private String  getURL(String s, String s1) {
        return "http://127.0.0.1";
    }
}
