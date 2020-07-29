package com.example.demo.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 在调用方法之前
     * 用于权限校验
     * 用户是否登录
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor--->preHandler");
        return HandlerInterceptor.super.preHandle(request,response,handler);
    }

    /**
     * 调用完方法之后，视图渲染之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor--->postHandle");
        HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);
    }

    /**
     * 整个完成之后，经常用于资源清理
     * 无论方法是否发生异常都会执行。
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginInterceptor--->afterCompletion");
        HandlerInterceptor.super.afterCompletion(request,response,handler,ex);
    }
}
