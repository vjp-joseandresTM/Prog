/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej3_ed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM
 */
public class EJ3_EDTest {

    public EJ3_EDTest() {
    }

    /**
     * Test of main method, of class EJ3_ED.
     */
    @Test
    public void testValorMinimo() {
        assertEquals(2, EJ3_ED.sumaPrimos(2));
    }

    @Test
    public void testHasta10() {
        assertEquals(17, EJ3_ED.sumaPrimos(10));
    }

    @Test
    public void testHasta12() {
        assertEquals(28, EJ3_ED.sumaPrimos(12));
    }

    @Test
    public void testNumeroGrande() {
        assertEquals(129, EJ3_ED.sumaPrimos(30));
    }

}
