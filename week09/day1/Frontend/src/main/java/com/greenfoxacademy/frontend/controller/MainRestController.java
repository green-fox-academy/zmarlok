package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.Doubling;
import com.greenfoxacademy.frontend.model.ErrorMessage;
import com.greenfoxacademy.frontend.model.Greeting;
import com.greenfoxacademy.frontend.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @Autowired
    private AppService appService;

    @GetMapping("/doubling")
    public Object getDoublednNumber(@RequestParam(name = "input", required = false)Integer numberInput){
        if (numberInput != null){
            return new Doubling(numberInput);
        } else {
            return new ErrorMessage("Please provide an input!");
        }
    }

    @GetMapping("/greeter")
    public Object greet(@RequestParam(name = "name", required = false)String nameInput,
                        @RequestParam(name = "title", required = false)String titleInput){
        if ((nameInput != null && nameInput.length()>0) && (titleInput != null && titleInput.length()>0)){
            return new Greeting("Hello " + nameInput + " my dear " + titleInput);
        } else if ((nameInput == null || nameInput.length() == 0) && (titleInput == null || titleInput.length() == 0)) {
            return new ErrorMessage("Please provide a name and a title!");
        } else if (titleInput == null || titleInput.length() == 0) {
            return new ErrorMessage("Please provide a title!");
        } else  {
            return new ErrorMessage("Please provide a name!");
        }

    }
}
