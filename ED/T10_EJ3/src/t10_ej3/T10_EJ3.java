/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T10_EJ3 {

    /**
     * @param args the command line arguments
     */
    
    //Creamos la lista y llamamos a los metodos necesarios
    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<>();
        rellenar(listaNum);
        mostrarOrdenar(listaNum);
    }
    //Metodo que rellena la lista.
    public static void rellenar(ArrayList<Integer> listaNum) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        do {
            System.out.println("Introduce un número entero o 'x' para salir: ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("x")) {
                try {
                    int numero = Integer.parseInt(entrada);
                    listaNum.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Debes introducir un número o 'x'.");
                }
            }

        } while (!entrada.equalsIgnoreCase("x"));
    }

    //Mostramos la lista original, la ordenamos y mostramos la lista con los cambios.
    public static void mostrarOrdenar(ArrayList<Integer> listNum) {
        System.out.println("\n LISTA SEGUN TU ORDEN: ");
        for (int i = 0; i < listNum.size(); i++) {
            System.out.println("* " + listNum.get(i));
        }

        if (listNum.size() >= 4) {

            int aux = listNum.get(1);
            listNum.set(1, listNum.get(3));
            listNum.set(3, aux);

            System.out.println("\n LISTA TRAS CAMBIAR POSICIÓN 2 POR 4:");
            for (int i = 0; i < listNum.size(); i++) {
                System.out.println("* " + listNum.get(i));
            }
        } else {
            System.out.println("\nNo hay suficientes elementos para intercambiar la posición 2 con la 4.");
        }
    }

}
