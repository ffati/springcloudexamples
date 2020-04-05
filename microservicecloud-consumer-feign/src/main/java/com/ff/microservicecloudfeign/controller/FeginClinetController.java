package com.ff.microservicecloudfeign.controller;

import com.ff.microservicecloudcurrency.entity.User;
import com.ff.microservicecloudcurrency.service.FeignClinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName FeginClinetController
 * @Description Feign客户端调用
 * @Author ff
 * @Date 2020/4/5 14:00
 * @ModifyDate 2020/4/5 14:00
 * @Version 1.0
 */

@RestController
public class FeginClinetController {


    @Autowired
    private FeignClinetService service;


    @RequestMapping(value = "/feignCline/findAll")
    public List<User> findAll(){

        return service.findAll();
    }

}
