package com.greenfoxacademy.springstart;

public class Greeting {

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    long id;
    String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }


}
