package com.ff.microservicecloudconfigeurekaclient8001.repository;

import com.ff.microservicecloudcurrency.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author ff
 * @Date 2020/4/4 18:46
 * @ModifyDate 2020/4/4 18:46
 * @Version 1.0
 */

public interface UserDao {
    
    @Select(value = "select * from user")
    List<User> findAll();
    
}
