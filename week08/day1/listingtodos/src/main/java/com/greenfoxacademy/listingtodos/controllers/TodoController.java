package com.greenfoxacademy.listingtodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/todo", method = RequestMethod.GET)
public class TodoController {

    @RequestMapping(path = {"/", "/list"}, method =RequestMethod.GET)
    @ResponseBody
    public String list(){
        return "This is my first todo";
    }
}
