/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edrepaso1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM
 */
public class Edrepaso1Test {
    
    public Edrepaso1Test() {
    }

    /**
     * Test of main method, of class Edrepaso1.
     */
    @Test
    public void testMain() {
        Edrepaso1 instance = new Edrepaso1();
        assertEquals(-1, instance.busquedaBinaria(0));
        assertEquals(0, instance.busquedaBinaria(1));
        assertEquals(4, instance.busquedaBinaria(5));
    
    }
    
}
