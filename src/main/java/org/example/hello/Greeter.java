package org.example.hello;

public class Greeter {
    private String greeting;

    public Greeter(String message) {
        this.greeting = message;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
