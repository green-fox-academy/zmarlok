package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/todo", method = RequestMethod.GET)
public class TodoController {

    private TodoRepository todoRepository;


    //inject the repository:
    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(path = {"/", "/list"}, method =RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
