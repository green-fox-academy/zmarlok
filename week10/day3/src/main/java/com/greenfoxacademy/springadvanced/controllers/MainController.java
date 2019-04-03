package com.greenfoxacademy.springadvanced.controllers;

import com.greenfoxacademy.springadvanced.models.Todo;
import com.greenfoxacademy.springadvanced.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private TodoService service;

    @Autowired
    public MainController(TodoService service){
        this.service = service;
    }

    @PostMapping(value = "/save")
    public Object saveTodos(@RequestBody Todo todo){
        service.saveTodo(todo);
        return "todo";
    }

    @GetMapping(value = "/todos")
    public String listTodos(){
        return "Hi";
    }


}
