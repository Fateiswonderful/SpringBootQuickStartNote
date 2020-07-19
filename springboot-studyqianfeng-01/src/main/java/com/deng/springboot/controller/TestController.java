package com.deng.springboot.controller;

import com.deng.springboot.entity.User;
import com.deng.springboot.properties.AliyunProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController class
 *
 * @author DengWeiCheng
 * @date 2020/7/17 17:48
 */
@RestController
public class TestController {
    @Autowired
    User user;


    /**
     * 测试@Bean注入
     * @return
     */
    @GetMapping("/")
    public String test(){
        return user.toString();
    }

    /**
     * 测试使用@Value("${Yml属性的KEY}")获取yml中配置的值
     */
    @Value("${picPath}")
    String picPath;
    @GetMapping("/picPath")
    public String picPath(){
        return picPath;
    }
    /**
     * 测试@ConfigurationProperties(prefix ="aliyun")  注入Yml配置文件的值
     */
    @Autowired
    AliyunProperties aliyunProperties;
    @GetMapping("/aliyun")
    public AliyunProperties aliyun(){
        return aliyunProperties;
    }
}
