package com.company;

public class VolleyballDecorator extends TeenagerDecorator{


    public VolleyballDecorator(Teenager teenager) {
        super(teenager);
    }

    String playVolleyball() {
        return "plays volleyball...";
    }

    @Override
    public String doAnything() {
        return super.doAnything() + playVolleyball();
    }
}
