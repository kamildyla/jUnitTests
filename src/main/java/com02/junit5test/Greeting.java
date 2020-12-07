package com02.junit5test;

public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    String helloWorld() {
        return HELLO + " " + WORLD;
    }

    String helloWorld(String name) {
        return HELLO + " " + name;
    }
}
