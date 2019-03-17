package com.greenfoxacademy.trialexam.service;

import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliasService {

    private AliasRepository aliasRepository;

    @Autowired
    public AliasService(AliasRepository aliasRepository){
        this.aliasRepository = aliasRepository;
    }

    public void saveAlias(Alias alias){
        aliasRepository.save(alias);
    }
}
