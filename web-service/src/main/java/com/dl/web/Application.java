package com.dl.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
public class Application  {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class, args);
        }catch (Exception e){
            e.printStackTrace();
            log.error("启动失败", e);
        }
    }
}
