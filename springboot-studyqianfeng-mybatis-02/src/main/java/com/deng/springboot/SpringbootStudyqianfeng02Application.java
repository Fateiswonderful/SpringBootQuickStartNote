package com.deng.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.deng.springboot.data.mapper"})
public class SpringbootStudyqianfeng02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyqianfeng02Application.class, args);
    }

}
