package test;

import main.Calculs;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculsTest {

    private Calculs c1 = null;
    private Calculs c2 = null;
    private Calculs c3 = null;

    private final Calculs calculator = new Calculs(10, 5);

    /**
     * Initialise les valeurs avant chaque test
     */
    @BeforeEach
    void setUp() throws Exception
    {
        c1 = new Calculs(1,2);
        c2 = new Calculs(10,20);
        c3 = new Calculs(100,200);
    }

    @Test
    public void multiplier() {
        if(c1.multiplier() != 2)
        {
            fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
        }
        assertEquals(c1.multiplier(), 2);
    }

    @Test
    public void additionner() {
        assertEquals(15, this.calculator.additionner());
    }

    @Test
    public void diviser() {
        assertEquals(2, this.calculator.diviser());
    }

    @Test
    public void soustraire() {
        assertEquals(5, this.calculator.soustraire());
    }
}
