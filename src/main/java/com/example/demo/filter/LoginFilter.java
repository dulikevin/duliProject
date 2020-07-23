package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 使用servlet3.0自带的注解来配置信息，同时需要在启动类上加上ServletComponentScan,扫描servlet注解
 */
@WebFilter(urlPatterns = "/*",filterName = "loginFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化了...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("chain.doFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("拦截器销毁了");
    }
}
