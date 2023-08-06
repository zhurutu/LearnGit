package com.example.priject.Controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch01")
public class BranchContrler {
    @RequestMapping("/hello01")
    public String branch(){
        return "hello branch01";
    }
}
