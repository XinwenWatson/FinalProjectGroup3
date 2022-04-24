/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardgame;

import static cardgame.Suit.*;

import static cardgame.Value.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhmay
 */
public class CardTest {
    
    public CardTest() {
    }
    
 
    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card(Value.ACE,Suit.HEARTS);      
        Value expResult = ACE;
        Value result = instance.getValue();
        assertEquals(expResult, result);

    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Value value = EIGHT;
        Card instance = new Card(Value.NINE,Suit.HEARTS);
        instance.setValue(value);

    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card(Value.NINE,Suit.HEARTS);
        Suit expResult = HEARTS;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        Suit suit = HEARTS;
        Card instance = new Card(Value.NINE,Suit.HEARTS);
        instance.setSuit(suit);
  
    }

    /**
     * Test of toString method, of class Card.
     */
  
    
}
