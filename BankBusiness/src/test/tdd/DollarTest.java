package test.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.tdd.Dollar;
import main.tdd.Franc;
import main.tdd.Money;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(10).equals(Money.dollar(6)));
        assertTrue(Money.Franc(5).equals(Money.Franc(5)));
        assertFalse(Money.Franc(5).equals(Money.Franc(6)));
        
        assertFalse(Money.Franc(5).equals(Money.dollar(6)));
        assertFalse(Money.Franc(5).equals(Money.dollar(5)));
    }
    
    @Test
    public void testFrancMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
}
