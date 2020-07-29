package com.example.demo.intercepter;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * springboot2.0之前使用这个，现在被弃用了。
 */
//@Configuration
public class CustomerOldWebMvcConfigurator extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor() ).addPathPatterns("/api/");
        super.addInterceptors(registry);
    }
}
