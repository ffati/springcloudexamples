package com.ff.microservicecloudeurekaclient8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan
@MapperScan("com.ff.microservicecloudeurekaclient8001.repository")
public class MicroservicecloudEurekaClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEurekaClient8001Application.class, args);
    }

}
