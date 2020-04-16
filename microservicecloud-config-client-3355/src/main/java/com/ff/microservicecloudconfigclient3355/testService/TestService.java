package com.ff.microservicecloudconfigclient3355.testService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author ff
 * @Date 2020/4/5 22:50
 * @ModifyDate 2020/4/5 22:50
 * @Version 1.0
 */

@RestController
public class TestService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    /**
     * 访问地址：http://localhost:8202/testService
     *  dev的端口是8201，test的端口是8203(配置文件不同，端口就不一样！)
     * @return
     */
    @RequestMapping("/testService")
    public String getConfig() {
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
        System.out.println(str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    }


}
