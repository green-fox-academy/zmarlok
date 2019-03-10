package com.greenfoxacademy.hundredacrewood.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InhabitantList {

    private List<Inhabitant> inhabitantList;

    public InhabitantList() {
        inhabitantList = new ArrayList<>();
        initializeList();
    }

    public void initializeList() {
        inhabitantList.add(new Inhabitant("Micimacko", 5, Gender.MALE));
        inhabitantList.add(new Inhabitant("Malacka", 4, Gender.MALE));
    }

    public List<Inhabitant> getInhabitantList() {
        return inhabitantList;
    }

    public Inhabitant getInhabitantById(int id) {

        for (Inhabitant inhabitant : inhabitantList) {
            if (inhabitant.getId() == id) {
                return inhabitant;
            }
        } return null;
    }

    public void addInhabitant(Inhabitant inhabitant){
        inhabitantList.add(inhabitant);
    }
}

