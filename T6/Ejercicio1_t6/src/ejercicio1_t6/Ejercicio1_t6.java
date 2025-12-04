/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_t6;

/**
 *
 * @author alumno
 */
public class Ejercicio1_t6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== PRUEBA SIN POLIMORFISMO ===");

        Suma s = new Suma(10, 5);
        Multiplicacion m = new Multiplicacion(10, 3);
        Potencias p = new Potencias(2, 4);

        s.realizarOperacion();
        m.realizarOperacion();
        p.realizarOperacion();

    }
    
}
