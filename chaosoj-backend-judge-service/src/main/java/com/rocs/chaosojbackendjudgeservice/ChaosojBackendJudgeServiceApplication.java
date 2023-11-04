package com.rocs.chaosojbackendjudgeservice;

import com.rocs.chaosojbackendjudgeservice.rabbitmq.InitRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.rocs")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.rocs.chaosojbackendserviceclient.service"})
public class ChaosojBackendJudgeServiceApplication {

    // 初始化消息队列，先注释掉，改用 Bean 的方式初始化消息队列（InitRabbitMqBean.java）
//    InitRabbitMq.doInit();
    public static void main(String[] args) {
        SpringApplication.run(ChaosojBackendJudgeServiceApplication.class, args);
    }

}
