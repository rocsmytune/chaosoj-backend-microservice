package com.rocs.chaosojbackendjudgeservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.rocs")
@SpringBootApplication
public class ChaosojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaosojBackendJudgeServiceApplication.class, args);
    }

}
