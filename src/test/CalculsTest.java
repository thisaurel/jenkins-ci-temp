package test;

import main.Calculs;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CalculsTest {

    private Calculs c1 = null;
    private Calculs c2 = null;
    private Calculs c3 = null;

    @Before
    public void setUp() throws Exception
    {
        c1 = new Calculs(1,2);
        c2 = new Calculs(10,20);
        c3 = new Calculs(100,200);
    }

    @Test
    public void multiplier() {
        assertEquals(c1.multiplier(), 2);
        assertEquals(c2.multiplier(), 200);
        assertEquals(c3.multiplier(), 20000);
    }

    @Test
    public void additionner() {
        assertEquals(c1.additionner(), 3);
        assertEquals(c2.additionner(), 30);
        assertEquals(c3.additionner(), 300);
    }

    @Test
    public void diviser() {
        assertEquals(c1.diviser(), 1/2);
        assertEquals(c2.diviser(), 1/2);
        assertEquals(c3.diviser(), 1/2);
    }

    @Test
    public void soustraire() {
        assertEquals(c1.soustraire(), -1);
        assertEquals(c2.soustraire(), -10);
        assertEquals(c3.soustraire(), -100);
    }
}
