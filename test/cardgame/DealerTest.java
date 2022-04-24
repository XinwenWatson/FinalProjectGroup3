/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardgame;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhmay
 */
public class DealerTest {
    
    public DealerTest() {
    }
    
   
    /**
     * Test of getInstance method, of class Dealer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        boolean expResult = true;
        boolean result = Dealer.getInstance() instanceof Dealer;
        assertEquals(expResult, result);

    }

    /**
     * Test of getCards method, of class Dealer.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Dealer instance = new Dealer();
        boolean expResult =true ;
        boolean result = instance.getCards() instanceof ArrayList<Card>;
        assertEquals(expResult, result);

    }
    
}
