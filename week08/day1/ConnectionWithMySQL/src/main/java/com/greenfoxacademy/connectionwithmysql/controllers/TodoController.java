package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(path = "/todo")
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
    public String showAddTodoForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "addtodo";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNewTodo(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteTodo(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String showUpdateView(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoRepository.findById(id).orElseThrow(NullPointerException::new));
        return "update";
    }


}
