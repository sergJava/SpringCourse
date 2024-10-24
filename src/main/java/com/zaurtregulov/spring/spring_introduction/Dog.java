package com.zaurtregulov.spring.spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {
    public Dog() {
        System.out.println("dog bean is created");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("destroy method");
//    }

    public void say(){
        System.out.println("Bow-wow");
    }
}
