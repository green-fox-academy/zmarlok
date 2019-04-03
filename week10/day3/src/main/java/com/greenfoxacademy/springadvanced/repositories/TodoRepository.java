package com.greenfoxacademy.springadvanced.repositories;

import com.greenfoxacademy.springadvanced.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
