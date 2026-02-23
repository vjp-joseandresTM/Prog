/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class EJ2_T10 {

    /**
     * @param args the command line arguments
     */
    
    //Creacion de lista y llamada a los metods
    public static void main(String[] args) {
        ArrayList<Integer> listNumeros = new ArrayList<>();
        rellenar(listNumeros);
        mostrar(listNumeros);
        ordenarMay(listNumeros);
        ordenarMen(listNumeros);
    }
    //Rellenamos la lista solo teniendo encuenta los numeros positivos
    public static void rellenar(ArrayList<Integer> listNumeros) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducir;
        do {
            System.out.print("Introduce un numero entero positivo:");
            numeroIntroducir = sc.nextInt();
            if (numeroIntroducir >= 0) {
                listNumeros.add(numeroIntroducir);
            }
        } while (numeroIntroducir > 0);
    }
    //Mostramos la lista segun el usuario la introduce.
    public static void mostrar(ArrayList<Integer> listNumeros) {
        System.out.println("\n NUMEROS INTRODUCIDOS:");
        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println((i + 1) + "." + listNumeros.get(i));
        }
    }
    //Con el metodo burbuja ordenamos la lista.
    public static void ordenarMay(ArrayList<Integer> listNumeros) {
        System.out.println("\n NUMEROS ORDENADOS MAYOR A MENOR");
        int aux;
        for (int i = 0; i < listNumeros.size() - 1; i++) {
            for (int j = 0; j < listNumeros.size() - 1 - i; j++) {
                if (listNumeros.get(j) < listNumeros.get(j + 1)) {
                    aux = listNumeros.get(j);
                    listNumeros.set(j, listNumeros.get(j + 1));
                    listNumeros.set(j + 1, aux);
                }
            }
        }

        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println((i + 1) + ". " + listNumeros.get(i));
        }
    }
    //Hacemos algo parecido me menor a mayor.
    public static void ordenarMen(ArrayList<Integer> listNumeros) {
        System.out.println("\nNUMEROS ORDENADOS DE MENOR A MAYOR:");

        int aux;

        for (int i = 0; i < listNumeros.size() - 1; i++) {
            for (int j = 0; j < listNumeros.size() - 1 - i; j++) {

                // Cambia la condicio ahora intercambiamos si el actual es MAYOR
                if (listNumeros.get(j) > listNumeros.get(j + 1)) {
                    aux = listNumeros.get(j);
                    listNumeros.set(j, listNumeros.get(j + 1));
                    listNumeros.set(j + 1, aux);
                }
            }
        }


        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println((i + 1) + ". " + listNumeros.get(i));
        }
    }

}
