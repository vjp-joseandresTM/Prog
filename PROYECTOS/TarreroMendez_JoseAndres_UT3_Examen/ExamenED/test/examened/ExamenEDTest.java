/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package examened;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class ExamenEDTest {
    
    public ExamenEDTest() {
    }

    /**
     * Test of main method, of class ExamenED.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of ordenarPorSeleccion method, of class ExamenED.
     */
    @Test
    public void testOrdenarPorSeleccion() {
        ExamenED instance = new ExamenED();
        int listaNumeros[] = {1,2,3,4,5,6};
        assertEquals(true, instance.ordenarPorSeleccion(listaNumeros));
        
        int numeros[] = {1,7,3,9,2};
        assertEquals(false, instance.ordenarPorSeleccion(numeros));
    }
    
}
