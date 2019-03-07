package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

    String name;
    float balance;
    String animalType;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public BankAccount(String name, float balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }
}
