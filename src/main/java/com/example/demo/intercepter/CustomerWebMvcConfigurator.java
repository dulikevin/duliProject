package com.example.demo.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * springboot2.0之后
 */
@Configuration
public class CustomerWebMvcConfigurator implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor() ).addPathPatterns("/exception/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
