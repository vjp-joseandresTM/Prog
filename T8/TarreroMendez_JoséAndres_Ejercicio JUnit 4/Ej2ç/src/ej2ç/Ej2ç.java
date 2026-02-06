/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2ç;

/**
 *
 * @author alumno
 */
public class Ej2ç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c = new Cuenta("José", 100);

        System.out.println(c);

        c.ingresar(50);
        System.out.println("Tras ingresar 50: " + c.getCantidad());

        c.retirar(30);
        System.out.println("Tras retirar 30: " + c.getCantidad());

        c.retirar(500);
        System.out.println("Tras retirar 500 (deja a 0): " + c.getCantidad());
    }

}
