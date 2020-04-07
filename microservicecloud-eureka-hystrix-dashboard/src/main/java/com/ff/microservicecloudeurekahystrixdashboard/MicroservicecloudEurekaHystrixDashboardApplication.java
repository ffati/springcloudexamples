package com.ff.microservicecloudeurekahystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroservicecloudEurekaHystrixDashboardApplication {

    /**
     * 访问地址: http://localhost:9001/hystrix
     * 监控应用地址：http://localhost:8001/actuator/hystrix.stream
     */

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEurekaHystrixDashboardApplication.class, args);
    }

}
