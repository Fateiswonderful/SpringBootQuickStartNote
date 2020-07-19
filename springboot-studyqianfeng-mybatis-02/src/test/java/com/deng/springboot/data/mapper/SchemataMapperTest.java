package com.deng.springboot.data.mapper;


import com.deng.springboot.SpringbootStudyqianfeng02ApplicationTests;
import com.deng.springboot.data.entity.Schemata;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 邓伟诚
 * @date 2020/7/19 17:53
 */
class SchemataMapperTest extends SpringbootStudyqianfeng02ApplicationTests {

    @Autowired
    SchemataMapper mapper;

    @Test
    void findAll() {
        List<Schemata> all = mapper.findAll();
        for (Schemata schemata : all) {
            System.out.println(schemata);
        }
    }
}