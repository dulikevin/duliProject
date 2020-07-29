package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {


    @RequestMapping("/index")
    public String showHello(ModelMap modelMap){
        modelMap.put("name","duli");
        return "tl/index";
    }




}
