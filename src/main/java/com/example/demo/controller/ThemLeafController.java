package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/themLeaf")
public class ThemLeafController {


    @RequestMapping("/index")
    public String showHello(ModelMap modelMap){
        modelMap.put("name","themLeaf");
        return "/tl/hello";
    }




}
