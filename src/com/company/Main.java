package com.company;

public class Main {

    public static void main(String[] args) {
	    Teenager teenager = new GuitarDecorator(new VolleyballDecorator(new TeenagerWithHobby()));

        System.out.println(teenager.doAnything());
    }
}
