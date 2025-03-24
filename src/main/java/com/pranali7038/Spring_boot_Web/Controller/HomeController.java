package com.pranali7038.Spring_boot_Web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Telusko";
    }
    @RequestMapping("/about")
    public String about(){
        return "welcome to about page";
    }
}
