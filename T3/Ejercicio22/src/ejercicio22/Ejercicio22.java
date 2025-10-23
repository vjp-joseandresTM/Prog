/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        
       
        
        try {
             System.out.print("Introduce el primer numero: ");
             numero1 = entrada.nextInt();
             System.out.print("Introduce el segundo numero: ");
             numero2 = entrada.nextInt();
             resultado = numero1 + numero2;
             System.out.println("El resultado de sumar los numeros es: " + resultado);
        } catch (Exception e) {
            System.err.println(" ERROR: No se puede introducir ese caracter");
        }
    }
    
}
