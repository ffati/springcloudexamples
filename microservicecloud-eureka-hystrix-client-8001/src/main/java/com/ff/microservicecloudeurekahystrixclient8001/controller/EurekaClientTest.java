package com.ff.microservicecloudeurekahystrixclient8001.controller;

import com.ff.microservicecloudcurrency.entity.User;
import com.ff.microservicecloudeurekahystrixclient8001.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    /*一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    这种方式耦合性极高,解耦和方式参照（服务降级）FeignClinetHystrixFallbackFactory*/
    @HystrixCommand(fallbackMethod = "HystrixTest")//注意指定方法的返回值类型要和此方法一致
    public User findAll(){
        User user=userService.findAll().get(0);
/*
        if (user.getName()!="")
            throw new RuntimeException("异常抛出");
*/

        return user;

    }


    public User  HystrixTest() {
        User user=new User();
        user.setName("HystrixTest成功");
        return user;
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
