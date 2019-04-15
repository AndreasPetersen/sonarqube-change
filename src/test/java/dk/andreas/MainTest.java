package dk.andreas;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void tested() {
        boolean result = Main.tested();

        assertTrue(result);
    }
}
