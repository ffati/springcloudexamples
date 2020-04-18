package com.ff.microservicecloudeurekahystrixclient8001.service.impl;

import com.ff.microservicecloudcurrency.entity.User;
import com.ff.microservicecloudeurekahystrixclient8001.repository.UserDao;
import com.ff.microservicecloudeurekahystrixclient8001.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author ff
 * @Date 2020/4/4 18:47
 * @ModifyDate 2020/4/4 18:47
 * @Version 1.0
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
