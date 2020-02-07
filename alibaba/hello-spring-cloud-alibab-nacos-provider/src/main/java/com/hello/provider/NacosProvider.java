package com.hello.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider.class,args);
    }
}
