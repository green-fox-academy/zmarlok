package com.greenfoxacademy.trialexam.controllers;

import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AliasController {

    private AliasService aliasService;

    @Autowired
    public AliasController(AliasService aliasService){
        this.aliasService = aliasService;
    }

    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("newalias", new Alias());
        return "main";
    }

    @PostMapping("/save-link")
    public String saveLink(@ModelAttribute Alias newalias){
        aliasService.saveAlias(newalias);
        return "redirect:/";
    }


}
