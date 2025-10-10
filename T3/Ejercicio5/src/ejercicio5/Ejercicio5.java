/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
    Scanner tcl = new Scanner(System.in);
    
    
    System.out.println("Introduce un numero: ");
    int num = tcl.nextInt();
    
    if (num % 2 == 0 ){
        System.out.println("El numero " + num + " es par");
    } else{
        System.out.println("El numero " + num + " es impar");
    }
  }
}
