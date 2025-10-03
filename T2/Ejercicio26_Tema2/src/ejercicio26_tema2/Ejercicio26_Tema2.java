/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26_tema2;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Ejercicio26_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Introduzca un numero de 4 cifras: ");
          int numeroGrande = sc.nextInt();
          
          int primeraCifra = numeroGrande / 1000;
          int segundaCifra = (numeroGrande / 100) % 10;
          int terceraCifra = (numeroGrande / 10) % 10;
          int cuartaCifra = numeroGrande % 10;
        
          System.out.println("La primera cifra es: " + primeraCifra);
          System.out.println("La segunda cifra es: " + segundaCifra);
          System.out.println("La tercera cifra es: " + terceraCifra);
          System.out.println("La cuarta cifra es: " + cuartaCifra);
          System.out.println("MAGIA");
        
    }
    
}
