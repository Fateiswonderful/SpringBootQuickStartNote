package com.deng.springboot.config;

import com.deng.springboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * UserConfig class
 *
 * @author DengWeiCheng
 * @date 2020/7/17 17:49
 */
@Configuration              //代表当前类是一个配置类
public class UserConfig {
    //如果不给name属性,name默认为方法名
    @Bean(name = "user")
    public User user(){
        return new User(1,"张三");
    }
}
