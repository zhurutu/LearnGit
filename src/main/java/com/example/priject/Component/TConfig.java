package com.example.priject.Component;

import com.example.priject.Entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TConfig {
    @Bean
    public Person Te(){
        return new Person("syy",21);
    }
}
