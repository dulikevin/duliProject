package com.example.demo.controller;

import com.example.demo.domain.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exception")
public class ExceptionController {


    @RequestMapping("showException")
    @ResponseBody
    public Object showException() throws Exception {
        int a = 0;
        try{
            a = 1/0;
            if(a == 10){
                return a;
            }
        }catch(Exception e) {
            int c= 100;
            System.out.println("c-->"+c);
            return a;
        }finally {
            int b = 5;
            System.out.println("hello。。。"+b);
        }
        return a;
    }


    @RequestMapping("/showMyException")
    public Object showMyException()  {

//        throw new MyException("500","出异常啦")
                int a = 1/0;
        System.out.println("myException......");
                return a;

    }






}
