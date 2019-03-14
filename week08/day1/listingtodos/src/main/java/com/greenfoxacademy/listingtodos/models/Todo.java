package com.greenfoxacademy.listingtodos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private boolean urgent;
    private boolean done;

    public Todo(){}

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        this.done = false;
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
