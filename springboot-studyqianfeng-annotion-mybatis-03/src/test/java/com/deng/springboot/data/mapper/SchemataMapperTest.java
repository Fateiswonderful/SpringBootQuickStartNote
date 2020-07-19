package com.deng.springboot.data.mapper;

import com.deng.springboot.SpringbootStudyqianfengAnnotionMybatisApplicationTests;
import com.deng.springboot.data.entity.Schemata;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 邓伟诚
 * @date 2020/7/19 18:45
 */
class SchemataMapperTest extends SpringbootStudyqianfengAnnotionMybatisApplicationTests {
    @Autowired
    SchemataMapper schemataMapper;

    @Test
    void findAll() {
        List<Schemata> list = schemataMapper.findAll();
        for (Schemata schemata : list) {
            System.out.println(schemata);
        }
    }

    @Test
    public void findByPage(){
        //使用PageHelper执行分页
        PageHelper.startPage(1,2);
        //执行查询
        List<Schemata> all = schemataMapper.findAll();
        //封装PageInfo对象
        PageInfo<Schemata>pageBean=new PageInfo<>(all);
        //输出
        for (Schemata schemata : pageBean.getList()) {
            System.out.println(schemata);
        }
    }

    @Test
    void queryOneById() {
        List<Schemata> def = schemataMapper.queryOneById("def");
        System.out.println(def.toString());
    }
}