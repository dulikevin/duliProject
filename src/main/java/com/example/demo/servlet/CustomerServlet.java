package com.example.demo.servlet;

import com.example.demo.domain.MyException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet/customerServlet",name = "customerServlet")
public class CustomerServlet extends HttpServlet {


    //总结在自定义的servlet中，如果没有手动抛出异常不会被全局异常捕获，且其默认跳到error.html页面中
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        String name = req.getParameter("name");
        System.out.println("调用servlet方法的doGet()方式进行处理。");
        int a = 1/0;
//        throw new MyException("500","算数异常");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        this.doGet(req,resp);
    }
}
