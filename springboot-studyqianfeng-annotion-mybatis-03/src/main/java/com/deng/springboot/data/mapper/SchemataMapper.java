package com.deng.springboot.data.mapper;

import com.deng.springboot.data.entity.Schemata;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 邓伟诚
 * @date 2020/7/19 18:27
 */

public interface SchemataMapper {


    public List<Schemata> findAll();


    @Select("select*from schemata where catalog_Name=#{name}")
    public List<Schemata> queryOneById(@Param("name") String schemataName);
}
