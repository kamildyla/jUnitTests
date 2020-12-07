package com02.junit5test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("before all once");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        System.out.println("beforeEach test");
    }

    @Test
    void testHelloWorld1() {
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void testHelloWorld2() {
        String name = "Kamil";
        assertEquals("Hello Kamil", greeting.helloWorld(name));
    }

    @AfterEach
    void tearDown() {
        System.out.println("aftre each test");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("after all once");
    }

}