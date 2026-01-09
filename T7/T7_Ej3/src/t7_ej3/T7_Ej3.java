/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T7_Ej3 {

    /**
     * @param args the command line arguments
     */
    
    //Pedimos al usuario un numero de lognitud en el main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud (máx 10): ");
        int longitud = sc.nextInt();

        if (longitud > 0 && longitud <= 10) {
            int[] numero = new int[longitud];
            genRand(numero);
            mostrarNum(numero);
        } else {
            System.out.println("La longitud debe ser entre 1 y 10.");
        }
    }
    //Generamos aleatorios
    public static void genRand(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 6) + 1;
        }
    }
    //Imprimimos los numeros 
    public static void mostrarNum(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

}
