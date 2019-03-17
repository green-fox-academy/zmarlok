package com.greenfoxacademy.trialexam.repository;

import com.greenfoxacademy.trialexam.models.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository<Alias, Integer> {
}
