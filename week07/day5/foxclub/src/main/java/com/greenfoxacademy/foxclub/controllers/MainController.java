package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }




}
