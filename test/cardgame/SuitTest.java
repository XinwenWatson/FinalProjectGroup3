/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhmay
 */
public class SuitTest {
    
    public SuitTest() {
    }
    


    /**
     * Test of values method, of class Suit.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Suit[] expResult = Suit.values();
        Suit[] result = Suit.values();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of valueOf method, of class Suit.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "SPADES";
        Suit expResult =Suit.valueOf(string);
        Suit result = Suit.valueOf(string);
        assertEquals(expResult, result);

    }
    
}
