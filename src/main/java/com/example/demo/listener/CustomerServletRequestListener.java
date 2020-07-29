package com.example.demo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CustomerServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("listener--->requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("listener--->requestDestroyed");
    }
}
