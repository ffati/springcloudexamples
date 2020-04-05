package com.ff.microservicecloudcurrency.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author ff
 * @Date 2020/4/4 18:43
 * @ModifyDate 2020/4/4 18:43
 * @Version 1.0
 */

@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private Integer Id;
    private String name;
    private String sex;


}
