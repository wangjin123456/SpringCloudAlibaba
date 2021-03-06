package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
   @Value("${server.port}")
    private String port;
    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message + "i am port=" +port;
    }


    /**
     * 注入配置文件上下文
     */
   @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;

   @GetMapping(value = "/hi")
   public  String sayhi(){
       return  "hello"+configurableApplicationContext.getEnvironment().getProperty("user.name");
   }






}
