package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String greet(){
        System.out.println("i am here");
        return "welcome to Home Page";   //sends  just a data
    }
    @RequestMapping("about")
    public String about(){
        return "we don't teach , we Educate";

    }
}
