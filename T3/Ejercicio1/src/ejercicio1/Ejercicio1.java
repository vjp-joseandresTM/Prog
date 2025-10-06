/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        
        int numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.print("Ese numerajo es positivo ");   
        } else if (numero < 0) {
            System.err.println("Ese numerajo es negativo");   
        } else {
            System.err.println("Ese zero");
        }
    }
    
}
