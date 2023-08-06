package com.example.priject.Test;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestJWT {
    public static void main(String[] args) {
//        JwtBuilder jwtBuilder = Jwts.builder();
//        String jwtToken=jwtBuilder.setHeaderParams("type","JWT").setHeaderParams("alg","HS256")
//        System.out.println("hello world");
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String encode = encoder.encode("123");
        System.out.println(encode);
        System.out.println(encoder.encode("123"));
        System.out.println(encoder.encode("123"));
        System.out.println(encoder.matches("123",encode));
    }
}
