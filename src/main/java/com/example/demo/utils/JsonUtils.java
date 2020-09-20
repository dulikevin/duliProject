package com.example.demo.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    //对象转换为字符串
    public static <T>  String obj2String(T obj){
        if(obj == null){
            return null;
        }

        try {
            return obj instanceof String ? (String)obj : objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //字符串转换为对象
    public static<T> T string2Object(String str,Class<T> clazz){
        if(StringUtils.isEmpty(str) || clazz == null){
            return null;
        }
        try {
            return clazz.equals(String.class) ? (T)str : objectMapper.readValue(str,clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }


    }






















}
