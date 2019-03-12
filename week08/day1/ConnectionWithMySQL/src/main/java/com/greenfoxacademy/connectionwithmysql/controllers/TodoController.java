package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public String listTodos(Model model, @RequestParam(value = "isActive", required = false) String string) {
        List<Todo> todoList = new ArrayList<>();
        todoRepository.findAll()
                .forEach(todoList::add);

        if (string != null && string.equalsIgnoreCase("true")) {

            List<Todo> onlyActiveTodos = todoList.stream()
                    .filter(todo -> !todo.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", onlyActiveTodos);
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "addtodo";
    }


}
