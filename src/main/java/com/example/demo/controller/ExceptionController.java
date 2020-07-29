package com.example.demo.controller;

import com.example.demo.domain.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/exception")
public class ExceptionController {


    @RequestMapping("showException")
    @ResponseBody
    public Object showException(HttpServletRequest request, ModelAndView model)  {
        System.out.println("showException");
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.println("model之前...");
        model.addObject("duli","hello");
        System.out.println("model之后...");
        return null;
    }

    @RequestMapping("/showMyException")
    public Object showMyException()  {
       throw new MyException("500","出异常啦");
    }
}
