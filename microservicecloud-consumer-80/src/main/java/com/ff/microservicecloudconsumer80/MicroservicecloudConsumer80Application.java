package com.ff.microservicecloudconsumer80;

import com.ff.customRule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-EUREKACLIENT-EXAMPLES", configuration = CustomRule.class)
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient指定的自定义规则类不可以和@ComponentScan同在一个包下面
public class MicroservicecloudConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumer80Application.class, args);
    }

}
