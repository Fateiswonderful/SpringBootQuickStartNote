package com.deng.springboot.data.mapper;

import com.deng.springboot.data.entity.Schemata;

import java.util.List;

/**
 * @author 邓伟诚
 * @date 2020/7/19 17:14
 */
public interface SchemataMapper {

    public List<Schemata> findAll();
}
