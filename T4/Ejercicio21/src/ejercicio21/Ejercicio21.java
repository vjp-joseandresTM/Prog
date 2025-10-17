/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada  = new Scanner(System.in);
    int numero1;
    int numero2;
    int resultado;
    
    System.out.print("Introduce el primer numero: ");
    numero1 = entrada.nextInt();
    System.out.print("Introduce el primer numero: ");
    numero2 = entrada.nextInt();
    
        try {
            resultado = numero1 / numero2 ;
            System.out.println("El resultado de dividir los numero fue " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("ERROR: No se puede dividir entre 0");
        }
    
    }
    
}
