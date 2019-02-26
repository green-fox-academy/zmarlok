package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong webGreetCounter = new AtomicLong();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        webGreetCounter.getAndIncrement();
        //String random = (fruits[new Random().nextInt(fruits.length)]);
        String randomHello = (hellos[new Random().nextInt(hellos.length)]);
        String randomColor = ((int)(Math.random()*256) + "," + (int)(Math.random()*256) + ", " + (int)(Math.random()*256));
        int randomFontSize = (1 + (int)(Math.random()*72));
        model.addAttribute("name", name);
        model.addAttribute("id", webGreetCounter);
        model.addAttribute("color", randomColor);
        model.addAttribute("fontsize", randomFontSize);
        model.addAttribute("hello", randomHello);
        return "greeting";
    }
}
