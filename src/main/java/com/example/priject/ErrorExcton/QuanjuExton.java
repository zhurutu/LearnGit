package com.example.priject.ErrorExcton;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class QuanjuExton {
    @ExceptionHandler(Exception.class)//需要捕获的异常类型
    public Object ExcptionHande(Exception e){
        Map map=new HashMap<>();
        map.put("message",e.getMessage());
        map.put("exception",e.getClass().getName());
        return map;
    }

}
