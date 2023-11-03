package com.rocs.chaosojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.rocs.chaosojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.rocs")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.rocs.chaosojbackendserviceclient.service"})
public class ChaosojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaosojBackendUserServiceApplication.class, args);
    }

}
