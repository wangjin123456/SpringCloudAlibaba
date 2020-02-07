package com.hello.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @GetMapping(value = "/echo/{message}")
    public  String echo(String message){
        return  "hello nacos"+message;
    }
}
