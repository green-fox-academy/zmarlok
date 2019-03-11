package com.greenfoxacademy.listingtodos.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo(long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
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

