package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion");

    @RequestMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("account", simbaAccount);

        return "show";
    }

    @RequestMapping("/test")
    public String showTest (Model model){
        return "test";
    }


    List<BankAccount> allAccount = new ArrayList<BankAccount>();
    BankAccount timonAccount = new BankAccount("Timon", 50, "rókamanguszta");
    BankAccount pumbaAccount = new BankAccount("Pumba", 100, "wildhog");
    BankAccount rafikiAccount = new BankAccount("Rafiki", 1800, "monkey");
    BankAccount oldLionAccount = new BankAccount("Öreg Oroszlán", 20000000, "lion");
    BankAccount birdAccount = new BankAccount("Madár", 10, "bird");


    @RequestMapping("/all")
    public String showAllAccount(Model model){

        allAccount.add(simbaAccount);
        allAccount.add(timonAccount);
        allAccount.add(pumbaAccount);
        allAccount.add(rafikiAccount);
        allAccount.add(oldLionAccount);
        allAccount.add(birdAccount);

        model.addAttribute("accountList", allAccount);

        return "all";
    }
}
