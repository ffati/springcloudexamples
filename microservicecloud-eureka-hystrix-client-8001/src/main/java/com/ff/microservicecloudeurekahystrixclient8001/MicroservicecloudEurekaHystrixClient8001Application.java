package com.ff.microservicecloudeurekahystrixclient8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@ServletComponentScan
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableHystrix
@MapperScan("com.ff.microservicecloudeurekahystrixclient8001.repository")
public class MicroservicecloudEurekaHystrixClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEurekaHystrixClient8001Application.class, args);
    }

}
