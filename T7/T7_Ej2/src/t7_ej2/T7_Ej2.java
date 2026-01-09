/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej2;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T7_Ej2 {

    /**
     * @param args the command line arguments
     */
    //Metodo principal que llama a los demas metodos.
    public static void main(String[] args) {
        int[] numeros = new int[7];
        genNumeros(numeros);
        mostrarNumeros(numeros);
        cambioNumero(numeros);

        System.out.println("Después del intercambio:");
        mostrarNumeros(numeros);
    }
    //Metodo que pide 7 numero al usuario
    public static void genNumeros(int[] numeros) {
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 1; i < 7; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }
    }
    //Metodo que imprime por pantalla los numeros obtenidos en el metodo anterior.
    public static void mostrarNumeros(int[] numeros) {
        int i;
        for (i = 0; i < 7; i++) {
            System.out.println(numeros[i]);
        }
    }
    //Hacemos un intercambio de dichos numeros obtenidos con la ayuda de un auxiilar
    public static void cambioNumero(int[] numeros) {
        int aux = numeros[1];
        numeros[1] = numeros[3];
        numeros[3] = aux;
    }

}
