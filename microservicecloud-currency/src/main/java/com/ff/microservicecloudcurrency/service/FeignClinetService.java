package com.ff.microservicecloudcurrency.service;

import com.ff.microservicecloudcurrency.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName FeignClinetService
 * @Description TODO
 * @Author ff
 * @Date 2020/4/5 13:45
 * @ModifyDate 2020/4/5 13:45
 * @Version 1.0
 */
@FeignClient(value = "MICROSERVICECLOUD-EUREKACLIENT-EXAMPLES")
public interface FeignClinetService {

    @RequestMapping(value = "/cline/findAll")
    List<User> findAll();

}
