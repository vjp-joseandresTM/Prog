package ej2ç;

import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaTest {

    public CuentaTest() {
    }

    @Test
    public void testGetTitular() {
        Cuenta c = new Cuenta("Jose", 100);
        assertEquals("Jose", c.getTitular());
    }

    @Test
    public void testSetTitular() {
        Cuenta c = new Cuenta("Jose", 100);
        c.setTitular("Maria");
        assertEquals("Maria", c.getTitular());
    }

    @Test
    public void testGetCantidad() {
        Cuenta c = new Cuenta("Jose", 150.5);
        assertEquals(150.5, c.getCantidad(), 0.0001);
    }

    @Test
    public void testSetCantidad() {
        Cuenta c = new Cuenta("Jose", 100);
        c.setCantidad(250.75);
        assertEquals(250.75, c.getCantidad(), 0.0001);
    }

    @Test
    public void testToString() {
        Cuenta c = new Cuenta("Jose", 100);
        String result = c.toString();
        assertTrue(result.contains("Jose"));
        assertTrue(result.contains("100"));
    }

    @Test
    public void testIngresar() {
        Cuenta c = new Cuenta("Jose", 100);
        c.ingresar(50);
        assertEquals(150, c.getCantidad(), 0.0001);

        // No debe cambiar si es negativo
        c.ingresar(-20);
        assertEquals(150, c.getCantidad(), 0.0001);
    }

    @Test
    public void testRetirar() {
        Cuenta c = new Cuenta("Jose", 100);

        c.retirar(40);
        assertEquals(60, c.getCantidad(), 0.0001);

        // Si retira más de lo que tiene → queda en 0
        c.retirar(200);
        assertEquals(0, c.getCantidad(), 0.0001);
    }
}
