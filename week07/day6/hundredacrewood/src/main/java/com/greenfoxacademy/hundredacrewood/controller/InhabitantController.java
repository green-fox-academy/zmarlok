package com.greenfoxacademy.hundredacrewood.controller;
import com.greenfoxacademy.hundredacrewood.model.Gender;
import com.greenfoxacademy.hundredacrewood.model.Inhabitant;
import com.greenfoxacademy.hundredacrewood.model.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InhabitantController {

    private InhabitantList inhabitantList;

    @Autowired
    public InhabitantController(InhabitantList inhabitantList) {
        this.inhabitantList = inhabitantList;
    }

    // ha több paramétert adok meg a RequestMappingnél, akkor kell a "path"-t vagy a "value"-t használni
    @RequestMapping(path = "/", method = RequestMethod.GET)
    // ugyanez kiváltható @GetMapping("/")-vel is
    public String getMainPage(){
        return "index";
    }

    @RequestMapping(path = "/inhabitants", method = RequestMethod.GET)
    public String showInhabitants(Model model){
        model.addAttribute("inhabitants", inhabitantList.getInhabitantList());
        return "inhabitant_table";
    }

    @RequestMapping(path = "/inhabitants/{id}", method = RequestMethod.GET)
    //1. lépés: új  method az inhabitantListen, ahol id alapján szűrök -> return inhabitant
    public String getInhabitantById(@PathVariable int id, Model model) {
        Inhabitant inhabitant = inhabitantList.getInhabitantById(id);
        if (inhabitant != null) {
            model.addAttribute("inhabitant_by_id", inhabitant);
        } else {
            model.addAttribute("error", "no inhabitant found by this id: "+ id);
        }
        return "inhabitant";
    }
    @RequestMapping(path = "/inhabitants/add", method = RequestMethod.GET)
    public String getInhabitantForm(@ModelAttribute(name = "inhabitant") Inhabitant inhabitant, Model model) {
        model.addAttribute("inhabitant", new Inhabitant());
        model.addAttribute("genders", Gender.values());
        return "inhabitant_form";
    }

    @RequestMapping(path = "/inhabitants/add", method = RequestMethod.POST)
    public String addInhabitantToList(@ModelAttribute(name = "inhabitant") Inhabitant inhabitant){
        inhabitantList.addInhabitant(inhabitant);
        return "redirect:/inhabitants";
    }


    //FŐLDALRA LINKEK - Table-re
    // - Addolásra link
    // - Link: Keresés névre, és ha megvan a név, akkor inhabitant/id


}
