/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import contenedorcalculos.*;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int num;
      System.out.println("Introduce un numero: ");
      num = sc.nextInt();
      
      Calculador.paroimpar(num);//Llamamos a la clase y a su funcion con la variable num
        
    }
    
}
