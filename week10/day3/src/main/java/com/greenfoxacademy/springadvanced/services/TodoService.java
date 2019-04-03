package com.greenfoxacademy.springadvanced.services;

import com.greenfoxacademy.springadvanced.models.Todo;
import com.greenfoxacademy.springadvanced.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    @Autowired
    public TodoService(TodoRepository repository){
        this.repository = repository;
    }

    public void saveTodo(Todo todo){
        repository.save(todo);
    }
}
