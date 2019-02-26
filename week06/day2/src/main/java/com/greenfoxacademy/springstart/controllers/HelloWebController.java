package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong webGreetCounter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        webGreetCounter.getAndIncrement();
        model.addAttribute("name", name);
        model.addAttribute("id", webGreetCounter);
        return "greeting";
    }
}
