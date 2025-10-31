/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13_t4;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio13_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numero = pedirNumero();
     calculo(numero);
        
    }
    
        public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce el número: ");
            numero = entrada.nextInt();

            if (!esValido(numero)) {
                System.err.println("Debe ser mayor que 0"); // Mensaje error
            }

        } while (!esValido(numero)); // Repetir hasta ser válido

        return numero; // Devolver número
    }
        
    public static boolean esValido(int numero) {
        return numero > 0; // Comprobar si es mayor que 0
    }
    
    public static void calculo(int numero){
      int contador = 0;  
      for(int i = 1 ; i <= numero ; i++){
          contador++;
          System.out.println(i); 
          
      } 
      System.out.println("Los numeros impresos fueron: " + contador );
    }
    
}
