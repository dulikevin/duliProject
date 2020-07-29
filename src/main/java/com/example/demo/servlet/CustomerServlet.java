package com.example.demo.servlet;

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
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("customer servlet");
        resp.getWriter().flush();
        resp.getWriter().close();

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
