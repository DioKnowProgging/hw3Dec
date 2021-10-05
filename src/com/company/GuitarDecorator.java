package com.company;

public class GuitarDecorator extends TeenagerDecorator{

    public GuitarDecorator(Teenager teenager) {
        super(teenager);
    }

    String playGuitar() {
        return "Trun' Trun'...";
    }

    @Override
    public String doAnything() {
        return super.doAnything() + playGuitar();
    }

}
