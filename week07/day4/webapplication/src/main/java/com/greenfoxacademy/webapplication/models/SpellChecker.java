package com.greenfoxacademy.webapplication.models;

import org.springframework.stereotype.Service;

@Service
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}
