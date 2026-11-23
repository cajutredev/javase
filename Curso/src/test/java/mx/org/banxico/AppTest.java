package mx.org.banxico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingReturnsExpectedMessage() {
        assertEquals("Hello, Java SE!", App.greeting());
    }
}
