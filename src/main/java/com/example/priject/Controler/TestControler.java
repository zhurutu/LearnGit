package com.example.priject.Controler;


import com.example.priject.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class TestControler {
    @Autowired
    private Person person;
    @RequestMapping("/test")
    public String Test(){
        return "hello spring boot";
    }
    @RequestMapping("/test/name")
    public String Test2(){
        ;        return "hello spring boot";
    }
    @RequestMapping("/T")
    public String Tes(@RequestBody Person person){
        System.out.println(person);
        return "hello spring boot";
    }

    @RequestMapping("/JWT")
    public String TestJWT(@RequestBody String name,@RequestBody String password){
        return "hello";
    }

}
