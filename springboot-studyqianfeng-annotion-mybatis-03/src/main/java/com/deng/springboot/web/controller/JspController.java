package com.deng.springboot.web.controller;

import com.deng.springboot.data.mapper.SchemataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * JspController class
 *
 * @author 邓伟诚
 * @date 2020/7/19 19:41
 */
@Controller
public class JspController {
    @Autowired
    SchemataMapper schemataMapper;

    @GetMapping("/index")
    public String getIndex(Model model){
        model.addAttribute("all",schemataMapper.findAll());
        return "index";
    }
}
