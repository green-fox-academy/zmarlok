package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    @Autowired
    public ConnectionwithmysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.deleteAll();
        todoRepository.save(new Todo("I have to learn Object Relational Mapping", false, false));
        todoRepository.save(new Todo("I have to understand everything what we learned so far", true, false));
        todoRepository.save(new Todo("I have to learn how to use CommandLineRunner", false, true));
        todoRepository.save(new Todo("Eat lunch", true, true));
    }
}
