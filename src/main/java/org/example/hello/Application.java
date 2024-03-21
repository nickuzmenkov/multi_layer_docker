package org.example.hello;

public class Application {
    public static void main(String[] args) {
        Greeter greeter  = new Greeter("Hello, world!");
        System.out.println(greeter.getGreeting());
    }
}
