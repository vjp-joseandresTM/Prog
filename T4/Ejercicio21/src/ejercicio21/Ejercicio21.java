/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int num1 = pedirNumero1();
        int num2 = pedirNumero2(num1);  
        int suma = sumarPares(num1, num2);
        mostrarResultado(num1, num2, suma);
    }

    // Método para pedir el primer número
    public static int pedirNumero1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        return sc.nextInt();
    }

    // Método para pedir el segundo número y comprobar que sea mayor
    public static int pedirNumero2(int num1) {
        Scanner sc = new Scanner(System.in);
        int num2;
        do {
            System.out.print("Introduce el segundo número : ");
            num2 = sc.nextInt();
            if (num2 <= num1) {
                System.out.println("El número debe ser mayor que " + num1);
            }
        } while (num2 <= num1);
        return num2;
    }

    // Método que calcula la suma de los números pares entre ambos
    public static int sumarPares(int num1, int num2) {
        int suma = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }
    
     public static void mostrarResultado(int num1, int num2, int suma) {
      System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + suma);
    }

}
