package com.ff.customRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GetCustomRule
 * @Description TODO
 * @Author ff
 * @Date 2020/4/5 12:06
 * @ModifyDate 2020/4/5 12:06
 * @Version 1.0
 */

@Configuration
public class GetCustomRule {

    public IRule getCustomRule(){

        return new CustomRule();

    }

}
