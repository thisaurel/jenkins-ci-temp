package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Calculs;

import org.junit.jupiter.api.Test;

class CalculsTest {

    private final Calculs calulator = new Calculs(2, 3);

    @Test
    void addition() {
        assertEquals(this.calulator.additionner(), 5);
    }

}
