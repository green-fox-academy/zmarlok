package com.greenfoxacademy.basicwebshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class BasicwebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicwebshopApplication.class, args);
    }

    @RequestMapping("/webshop")
    @ResponseBody
    public String hello (){
        return "Hello WEBSHOP";
    }
}
