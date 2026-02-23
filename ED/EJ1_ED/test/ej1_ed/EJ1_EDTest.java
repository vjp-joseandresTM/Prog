/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej1_ed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM
 */
public class EJ1_EDTest {

    public EJ1_EDTest() {
    }

    /**
     * Test of busquedaBinaria method, of class EJ1_ED.
     */
    @Test
    public void testBusquedaBinaria() {
        EJ1_ED instance = new EJ1_ED();

        // Número presente al inicio
        assertEquals(0, instance.busquedaBinaria(1));

        // Número presente en el medio
        assertEquals(4, instance.busquedaBinaria(5));

        // Número presente al final
        assertEquals(9, instance.busquedaBinaria(10));

        // Número no presente dentro del rango
        assertEquals(-1, instance.busquedaBinaria(11));

        // Número menor que el mínimo
        assertEquals(-1, instance.busquedaBinaria(0));

        // Número mayor que el máximo
        assertEquals(-1, instance.busquedaBinaria(20));
    }

}
