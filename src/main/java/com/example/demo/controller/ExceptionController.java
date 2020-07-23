package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exception")
public class ExceptionController {


    @RequestMapping("showException")
    @ResponseBody
    public Object showException()  {
        int a = 1/0;
        System.out.println("hello,你好啊，master");
        return a;
    }


    @RequestMapping("/showMyException")
    public Object showMyException()  {

//        throw new MyException("500","出异常啦")
                int a = 1/0;
        System.out.println("myException......");
        System.out.println("hello，你好啊");
        System.out.println("你好啊");
                return a;


    }






}
