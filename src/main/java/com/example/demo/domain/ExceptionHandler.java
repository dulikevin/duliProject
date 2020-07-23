package com.example.demo.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandler {

    private static final Logger LOGGER  = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    Object handlerException(Exception e, HttpServletRequest request){
        LOGGER.error("全局异常，msg{},url{}",e.getMessage(),request.getRequestURL());
        Map<String,Object> map = new HashMap<>();
        map.put("code",500);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        System.out.println("Exception 异常");
        return map;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = MyException.class)
    Object handlerMyException(MyException e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("exception.html");
        modelAndView.addObject("msg",e.getMessage());
        System.out.println("MyException 异常");
        return modelAndView;

    }








}
