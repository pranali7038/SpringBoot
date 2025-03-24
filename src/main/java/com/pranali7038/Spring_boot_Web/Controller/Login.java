package com.pranali7038.Spring_boot_Web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @RequestMapping("/login")
    public String login(){
        return "Welcome to login page";
    }
}
