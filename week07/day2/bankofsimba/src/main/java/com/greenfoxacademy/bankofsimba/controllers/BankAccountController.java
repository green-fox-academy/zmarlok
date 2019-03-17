package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccount simbaAccount = new BankAccount("Simba", 20000, "lion", true, true);
    List<BankAccount> allAccount = new ArrayList<BankAccount>();

    public BankAccountController() {
        this.allAccount.add(new BankAccount("Simba", 2000, "lion", true, true));
        this.allAccount.add(new BankAccount("Timon", 50, "rókamanguszta", false, true));
        this.allAccount.add(new BankAccount("Pumba", 100, "wildhog", false, true));
        this.allAccount.add(new BankAccount("Rafiki", 1500, "monkey", false, true));
        this.allAccount.add(new BankAccount("Öreg Oroszlán", 200000, "lion", true, true));
        this.allAccount.add(new BankAccount("Gonosz Állat", 10, "bird", false, false));
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showAccount(Model model) {
        model.addAttribute("account", simbaAccount);
        return "bank_account";
    }

    @RequestMapping(value = "/html_text", method = RequestMethod.GET)
    public String showHTMLText(Model model) {
        model.addAttribute("someString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "test_string";
    }

    @GetMapping("/all")
    public String showAllAccount(Model model) {
        model.addAttribute("allAccount", allAccount);
        model.addAttribute("newBankAccount", new BankAccount());
        return "all_accounts";
    }

    @PostMapping("/raise_balance")
    public String raiseSelectedAccountsBalance(@RequestParam int animalIndex) {
        allAccount.get(animalIndex).raiseBalance();
        return "redirect:/all";
    }

    @PostMapping("/add")
    public String addBankAccount(@ModelAttribute BankAccount newBankAccount) {
        allAccount.add(newBankAccount);
        return "redirect:/all";
    }
}
