package com.greenfoxacademy.webapplication;

import com.greenfoxacademy.webapplication.models.MyColor;
import com.greenfoxacademy.webapplication.models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebapplicationApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    public WebapplicationApplication(@Qualifier("Green") MyColor color){
        this.color = color;
    }

   /* EXERCISE ONE - Without myColor interface
    @Autowired
    WebapplicationApplication(Printer printer){
	    this.printer = printer;
    } */

    public static void main(String[] args) {
        SpringApplication.run(WebapplicationApplication.class, args);
    }

    /* EXERCISE ONE - Without myColor interface
    @Override
    public void run(String... args) throws Exception {
        printer.log("JO NAPOT!");
    } */

    @Override
    public void run(String... args) throws Exception {
        this.color.printColor();
    }
}
