/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9b;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio9b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los números al usuario
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduzca el tercer numero: ");
        int num3 = scanner.nextInt();
        
        System.out.print("Por último, introduzca un cuarto numero: ");
        int num4 = scanner.nextInt();
        
        // Crear un array con los números
        int[] numeros = {num1, num2, num3, num4};
        
        // Aplicar el método de la burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar posiciones
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        // Mostrar el resultado
        System.out.print("El orden de los números introducidos es el ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" - ");
            }
        }
    }
    
}
