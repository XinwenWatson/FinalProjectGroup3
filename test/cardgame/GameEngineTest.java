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
public class GameEngineTest {
    
    public GameEngineTest() {
    }
    


    /**
     * Test of getPlayer method, of class GameEngine.
     */
   @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        boolean expResult = true;
        boolean result = GameEngine.getPlayer() instanceof Player;
        assertEquals(expResult, result);

    }

    /**
     * Test of getInstance method, of class GameEngine.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        boolean expResult = true;
        boolean result = GameEngine.getInstance() instanceof GameEngine;
        assertEquals(expResult, result);

    }

    /**
     * Test of restart method, of class GameEngine.
     */
    @Test
    public void testRestart() {
        System.out.println("restart");
        boolean expResult = false;
        boolean result = GameEngine.restart();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of play method, of class GameEngine.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        GameEngine.play();
    
    }
    
}
