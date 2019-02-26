package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

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

    static AtomicLong atomicLong = new AtomicLong();

    long id;
    String content;

    public Greeting(long id, String content){
        atomicLong.getAndIncrement();
        this.id = atomicLong.longValue();
        this.content = "Hello " + content + "!";
    }


}
