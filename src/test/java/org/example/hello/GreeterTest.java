package org.example.hello;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
    @Test
    public void testGreeter() {
        String greeting = UUID.randomUUID().toString();
        Greeter greeter = new Greeter(greeting);
        assertEquals(greeting, greeter.getGreeting());
    }
}