package com.greenfoxacademy.webapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilitiesController {

    @RequestMapping(value = "/useful")
    public String useful(){
        return "useful";
    }
}
