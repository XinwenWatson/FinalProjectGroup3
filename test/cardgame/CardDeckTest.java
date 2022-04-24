/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardgame;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhmay
 */
public class CardDeckTest {
    
    public CardDeckTest() {
    }
    
   

    /**
     * Test of getInstance method, of class CardDeck.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        boolean expResult = false;
        boolean result = CardDeck.getInstance().equals("");
        assertEquals(expResult, result);

    }

    /**
     * Test of generateCard method, of class CardDeck.
     */
    @Test
    public void testGenerateCard() {
        System.out.println("generateCard");
        boolean expResult = true;
        boolean result = CardDeck.generateCard()instanceof Card;
        assertEquals(expResult, result);

    }

    /**
     * Test of restartTheDeck method, of class CardDeck.
     */
    @Test
    public void testRestartTheDeck() {
        System.out.println("restartTheDeck");
        CardDeck.restartTheDeck();

    }
    
}
