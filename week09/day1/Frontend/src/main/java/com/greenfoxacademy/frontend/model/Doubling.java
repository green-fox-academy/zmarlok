package com.greenfoxacademy.frontend.model;

public class Doubling {

    private int received;
    private int result;

    public Doubling(Integer numberInput) {
        this.received = numberInput;
        this.result = numberInput * 2;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
