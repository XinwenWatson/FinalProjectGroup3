/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardgame;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhmay
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player("Tom");
        String expResult = "Tom";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance =new Player("Tom");
        instance.setName(name);
        
    }

    /**
     * Test of getCards method, of class Player.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Player instance = new Player("Zhang");
        boolean expResult = true;
        boolean result = instance.getCards() instanceof ArrayList<Card>;
        assertEquals(expResult, result);

    }
    
}
