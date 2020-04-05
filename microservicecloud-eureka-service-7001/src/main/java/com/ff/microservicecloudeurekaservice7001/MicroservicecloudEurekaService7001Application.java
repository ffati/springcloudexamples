package com.ff.microservicecloudeurekaservice7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicecloudEurekaService7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEurekaService7001Application.class, args);
    }

}
