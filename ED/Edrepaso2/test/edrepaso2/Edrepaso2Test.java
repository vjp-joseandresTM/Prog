/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edrepaso2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM
 */
public class Edrepaso2Test {
    
    public Edrepaso2Test() {
    }

    /**
     * Test of main method, of class Edrepaso2.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of sumaPrimos method, of class Edrepaso2.
     */
    @Test
    public void testSumaPrimos() {
        Edrepaso2 instance = new Edrepaso2();
        assertEquals(328, instance.sumaPrimos(50));
    }
    
}
