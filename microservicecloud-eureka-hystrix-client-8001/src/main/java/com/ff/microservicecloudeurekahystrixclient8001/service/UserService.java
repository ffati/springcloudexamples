package com.ff.microservicecloudeurekahystrixclient8001.service;

import com.ff.microservicecloudcurrency.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName uuu
 * @Description TODO
 * @Author ff
 * @Date 2020/4/4 18:48
 * @ModifyDate 2020/4/4 18:48
 * @Version 1.0
 */

@Service
public interface UserService {
    
    List<User> findAll();
    
}
