package com.deng.springboot;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;

/**
 * @SpringBootApplication(exclude = QuartzAutoConfiguration.class)可以指定排除相应的内容不使用自动装配
 */
@SpringBootApplication(exclude = QuartzAutoConfiguration.class)
public class SpringbootStudyqianfeng01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyqianfeng01Application.class, args);
    }

}
