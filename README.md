   
   # springcloudexamples
    springcloud学习项目demo

版本信息
```
    spring.boot.version:2.1.4.RELEASE
    spring.cloud.version:Greenwich.SR1
```
    
  项目模块列表
  

        <module>microservicecloud-zuul-9527</module>
        <module>microservicecloud-config-service-3344</module>
        --实现config的config服务端的demo，负责和git库（https://github.com/ffati/microservicecloud-configService-test.git）交互
        
        <module>microservicecloud-config-client-3355</module>
        --实现config的测试config-service-3344的demo
        
        <module>microservicecloud-config-eureka-service-7001</module>
        --实现config的服务端demo
        
        <module>microservicecloud-config-eureka-client-8001</module>
        --实现config的客户端demo
        
        <module>microservicecloud-currency</module>
        --公共模块
        
        <module>microservicecloud-eureka-service-7001</module>
        <module>microservicecloud-eureka-service-7002</module>
        --eureka的服务端注册中心demo
        
        <module>microservicecloud-eureka-client-8001</module>
        <module>microservicecloud-eureka-client-8002</module>
        --eureka的客户端demo
        
        <module>microservicecloud-eureka-hystrix-dashboard</module>
        ---hystrix-dashboard监控demo
        
        <module>microservicecloud-eureka-hystrix-client-8001</module>
        --实现了熔断的eureka的客户端demo
        
        <module>microservicecloud-consumer-feign</module>
        --feign实现了熔断机制的消费端demo
        
        <module>microservicecloud-consumer-80</module>
        --ribbon搭配RestTemplate实现负载均衡的消费端demo



远程配置中心地址

https://github.com/ffati/microservicecloud-configService-test

