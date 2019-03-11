package com.greenfoxacademy.listingtodos.controller;

import com.greenfoxacademy.listingtodos.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TodoController {

    private Todo toDo;

    @RequestMapping(path = "/todo", method = RequestMethod.GET)
    public String showTodos(Model model) {
        model.addAttribute("todos", toDo);
        return "todo_table";
    }

    @RequestMapping(path = "/", method =RequestMethod.GET)
    public String list()

}
