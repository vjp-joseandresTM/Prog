/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CalculadoraTest {



    @Test
    public void testSumar() {
        Calculadora c = new Calculadora(5, 3);
        assertEquals(100, c.sumar(), 0.0001);
    }

    @Test
    public void testRestar() {
        Calculadora c = new Calculadora(5, 3);
        assertEquals(2, c.restar(), 0.0001);
    }

    @Test
    public void testMultiplicar() {
        Calculadora c = new Calculadora(5, 3);
        assertEquals(15, c.multiplicar(), 0.0001);
    }

    @Test
    public void testDividir() {
        Calculadora c = new Calculadora(10, 2);
        assertEquals(5, c.dividir(), 0.0001);
    }

}
