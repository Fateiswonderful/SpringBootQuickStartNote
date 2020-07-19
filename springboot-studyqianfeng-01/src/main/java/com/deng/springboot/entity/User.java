package com.deng.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User class
 *
 * @author DengWeiCheng
 * @date 2020/7/17 17:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private  String name;

}
