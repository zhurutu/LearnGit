package com.example.priject.Fileter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")//
@Order(1)//指定过滤器的执行顺序
public class FirstFilet implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //该方法执行后直接运行至下一个过滤器
        System.out.println("过滤器01——————in");//执行前
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("过滤器01______out");
    }
}
