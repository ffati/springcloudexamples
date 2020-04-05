package com.ff.microservicecloudconsumer80.controller.consumerTest;

import com.ff.microservicecloudcurrency.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName ConsumerTestController
 * @Description restTemplate和ribbon实现负载均衡
 * @Author ff
 * @Date 2020/4/4 18:11
 * @ModifyDate 2020/4/4 18:11
 * @Version 1.0
 */


@RestController
public class ConsumerTestController {

    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-EUREKACLIENT-EXAMPLES";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/allUser")
    public List<User> discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/cline/findAll", List.class);
    }



}
