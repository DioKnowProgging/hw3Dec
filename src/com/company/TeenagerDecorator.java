package com.company;

public class TeenagerDecorator implements Teenager{
    private Teenager teenager;

    public TeenagerDecorator(Teenager teenager) {
        this.teenager = teenager;
    }

    @Override
    public String doAnything() {
        return teenager.doAnything();
    }
}
