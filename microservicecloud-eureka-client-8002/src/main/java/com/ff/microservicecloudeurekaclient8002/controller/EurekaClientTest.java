package com.ff.microservicecloudeurekaclient8002.controller;

import com.ff.microservicecloudcurrency.entity.User;
import com.ff.microservicecloudeurekaclient8002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName EurekaClientTest
 * @Description TODO
 * @Author ff
 * @Date 2020/4/4 15:32
 * @ModifyDate 2020/4/4 15:32
 * @Version 1.0
 */

@RestController
public class EurekaClientTest {

    @Autowired
    private DiscoveryClient client;

    @Resource
    private UserService userService;




    @RequestMapping(value = "/cline/findAll")
    public List<User> findAll(){

        return userService.findAll();
    }


    /**
     * 服务发现：可以得到当前在eureka中已注册的服务
     *
     * @return
     */
    @RequestMapping(value = "/eurekaclient/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("ClientList" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-EUREKACLIENT-EXAMPLES");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }

}
