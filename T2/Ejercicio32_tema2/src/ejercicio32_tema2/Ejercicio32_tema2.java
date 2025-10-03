/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32_tema2;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio32_tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Introduce un numero:" );
       int numeroTotal = sc.nextInt();
       int bCincuenta = numeroTotal / 50;
       int resto = numeroTotal % 50;
       
       int bVeinte = resto / 20;
       resto = resto % 20;
       
       int bDiez = resto / 10;
       resto = resto % 10;
       
       int bCinco = resto / 5;
       resto =  resto % 5;
       
       int mDos = resto / 2;
       resto = resto % 2;
       
       int mUno = resto;
       
         System.out.println("Billetes de 50: " + bCincuenta);
         System.out.println("Billetes de 20: " + bVeinte);
         System.out.println("Billetes de 10: " + bDiez);
         System.out.println("Billetes de 5: " + bCinco);
         System.out.println("Monedas de 2: " + mDos);
         System.out.println("Monedas de 1º: " + mUno);

    }
    
}
