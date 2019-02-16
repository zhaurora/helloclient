package com.huawei.cse.controller;

import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class WebappDelegate {

    private RestTemplate restTemplate = RestTemplateBuilder.create();
    
    public String helloworld(String name){
        String hello = restTemplate.getForObject("cse://helloworld/cse/helloworld?name=" + name, String.class);
        // Do Some Magic Here!
        return hello;
    }
}
