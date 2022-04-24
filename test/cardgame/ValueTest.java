
package cardgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhmay
 */
public class ValueTest {
    
    public ValueTest() {
    }
    
   

    /**
     * Test of values method, of class Value.
     */
    @Test
    public void testValues() {
        System.out.println(Value.values());
        Value[] expResult =Value.values() ;
        Value[] result = Value.values();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of valueOf method, of class Value.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "TWO";
        Value expResult = Value.valueOf(string);
        Value result = Value.valueOf(string);
        assertEquals(expResult, result);

    }
    
}
