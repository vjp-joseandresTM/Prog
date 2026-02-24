/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T10_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listNumero = new ArrayList<>();
        rellenar(listNumero);
        mostrarOrdenar(listNumero);
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
    //Mostramos la lista original, cambiamos valores repetidos y volvemos a mostrar la lista como la hemos cambiado.
    public static void mostrarOrdenar(ArrayList<Integer> listaNumeros) {
        System.out.println("\nMOSTRAR LISTA ORIGINAL");
        for (int n : listaNumeros) {
            System.out.println("*" + n);
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            int valor = listaNumeros.get(i);

            if (valor == 0) {
                continue;
            }

            for (int j = i + 1; j < listaNumeros.size(); j++) {
                if (listaNumeros.get(j) == valor) {
                    listaNumeros.set(j, 0);
                }
            }
        }

        System.out.println("\nLISTA TRAS SUSTITUIR REPETIDOS POR 0");
        for (int n : listaNumeros) {
            System.out.println("*" + n);
        }
    }

}
