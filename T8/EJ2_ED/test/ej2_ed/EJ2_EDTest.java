/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej2_ed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM
 */
public class EJ2_EDTest {
    
    public EJ2_EDTest() {
    }

    /**
     * Test of main method, of class EJ2_ED.
     */
    @Test
    public void testBurbuja() {
        EJ2_ED instancia = new EJ2_ED();

        int[] array = {3, 2, 6, 7, 9};

        boolean estabaOrdenado = instancia.burbuja(array);

        // Comprobamos que NO estaba ordenado al inicio
        assertFalse(estabaOrdenado);

        // Comprobamos que ahora está ordenado
        int[] esperado = {2, 3, 6, 7, 9};
        assertArrayEquals(esperado, array);
    }
    
}
