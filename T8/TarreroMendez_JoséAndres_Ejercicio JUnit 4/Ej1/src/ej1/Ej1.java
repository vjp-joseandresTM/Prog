/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author alumno
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora(10, 5);

        System.out.println("Suma: " + c.sumar());
        System.out.println("Resta: " + c.restar());
        System.out.println("Multiplicación: " + c.multiplicar());
        System.out.println("División: " + c.dividir());
    }
    
}
