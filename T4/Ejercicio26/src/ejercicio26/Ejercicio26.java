/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author Jose
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = numeros();
        
      
        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo.");
        } else {
            System.out.println("El numero " + numero + " no es primo.");
        }
    }
    
    public static int numeros(){
    Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        return num;
    }
    
    public static boolean esPrimo(int num){
        
        if (num <= 1) {
         return false;
        }
        
        int contador = 2;
        boolean esPrimo = true;
        
        while(esPrimo && contador < num){
            if(num % contador == 0){
                esPrimo = false;
            }
            contador++;
        }
        return esPrimo;
    }
}

