package com.example.priject.Controler;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/errors")
public class Error {
    @RequestMapping("/error404")
    public Map error(HttpServletRequest request, HttpServletResponse response){
        Map map=new HashMap();
        map.put("status",404);
        map.put("path",request.getRequestURI());
        map.put("content","无法找到路径");
        return map;
    }
}
