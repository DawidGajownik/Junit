package pl.coderslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    @Test
    void greet() {
        GreetingController greetingController = new GreetingController("siema");
        String result = greetingController.greet("elo").getMessage();
        assertEquals(result, "Hello, " + "elo" + "!");
    }

    @Test
    void greetEmpty() {
        GreetingController greetingController = new GreetingController("siema");
        String result = greetingController.greet(null).getMessage();
        assertEquals(result, "Hello, " + "World" + "!");
    }
}