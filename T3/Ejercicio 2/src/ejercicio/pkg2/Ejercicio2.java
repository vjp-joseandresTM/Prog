/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número: ");
        int numero1 = sc.nextInt();
  
        System.out.print("Por favor, introduzca un número: ");
        int numero2 = sc.nextInt();
     
        if (numero1 > 10) {
           int multiplicar = numero1 * numero2;
           System.out.println("La operación que se realizó es producto y el resultado es" + multiplicar);
        }else{
            int suma = numero1 + numero2;
            System.out.println("La operación que se realizó es suma y el resultado es " + suma);
            
        }
        
        
    }
    
}
