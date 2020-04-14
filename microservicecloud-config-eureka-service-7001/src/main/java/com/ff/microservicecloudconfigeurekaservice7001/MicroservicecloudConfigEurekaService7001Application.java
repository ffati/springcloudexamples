package com.ff.microservicecloudconfigeurekaservice7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicecloudConfigEurekaService7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigEurekaService7001Application.class, args);
    }

}
