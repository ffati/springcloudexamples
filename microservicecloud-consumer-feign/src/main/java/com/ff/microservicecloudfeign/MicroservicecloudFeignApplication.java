package com.ff.microservicecloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ff"})
@ComponentScan("com.ff")
public class MicroservicecloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudFeignApplication.class, args);
    }

}
