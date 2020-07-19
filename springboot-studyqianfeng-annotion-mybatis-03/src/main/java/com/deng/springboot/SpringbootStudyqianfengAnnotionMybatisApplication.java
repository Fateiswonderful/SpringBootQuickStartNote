package com.deng.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.deng.springboot.data.mapper"})
public class SpringbootStudyqianfengAnnotionMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyqianfengAnnotionMybatisApplication.class, args);
    }

}
