package com.example.priject.Controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class MasertContrller {
    public void test(){
        System.out.println("hebing");
        System.out.println("test");
        System.out.println("marin");

    }
}
