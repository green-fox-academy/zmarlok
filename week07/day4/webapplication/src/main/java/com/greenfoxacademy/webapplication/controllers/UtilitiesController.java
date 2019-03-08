package com.greenfoxacademy.webapplication.controllers;

import com.greenfoxacademy.webapplication.models.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilitiesController {

    private UtilityService utilities;

    @Autowired
    public UtilitiesController(UtilityService utilities) {
        this.utilities = utilities;
    }

    @GetMapping("/useful")
    public String displayUtilities(Model model) {
        model.addAttribute("listOfColors", this.utilities.getColorList());
        return "links_to_utilities";
    }

    @GetMapping("/useful/colored")
    public String setRandomBackgroundColor(Model model) {
        model.addAttribute("color", this.utilities);
        return "useful";
    }
}
