package com.ff.microservicecloudconfigeurekaclient8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan
@MapperScan("com.ff.microservicecloudconfigeurekaclient8001.repository")
public class MicroservicecloudConfigEurekaClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigEurekaClient8001Application.class, args);
    }

}
