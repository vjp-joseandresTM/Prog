/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16_tema2;

/**
 *
 * @author alumno
 */
public class Ejercicio16_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int totalDinero = 130;
       int bCincuenta = 50;
       int bDiez = 10;
       
       int cincuenta = totalDinero / bCincuenta;
       int queda = totalDinero % bCincuenta;
       int diez = queda / bDiez;
       
       System.out.println("En total: " +totalDinero+"€. En billetes son:"+ cincuenta + "de 50 y " + diez + " de 10");
    }
    
}
