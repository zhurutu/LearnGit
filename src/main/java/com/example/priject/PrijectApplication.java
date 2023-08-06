package com.example.priject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan//这个
public class PrijectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrijectApplication.class, args);
    }

}
