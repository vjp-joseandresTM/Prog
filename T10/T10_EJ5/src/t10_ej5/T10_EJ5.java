/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T10_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<>();
        rellenar(listaNum);
        mostrarLista(listaNum);
        int mayorPar = mayorPar(listaNum);
        int menorImpar = menorImpar(listaNum);
        System.out.println("Mayor número par: " + mayorPar);
        System.out.println("Menor número impar: " + menorImpar);
        intercambiar(listaNum, mayorPar, menorImpar);
        System.out.println("Lista después del intercambio:");
        mostrarLista(listaNum);
    }

    //Rellenamos la lista solo teniendo encuenta los numeros positivos
    public static void rellenar(ArrayList<Integer> listaNum) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducir;
        do {
            System.out.print("Introduce un numero entero positivo:");
            numeroIntroducir = sc.nextInt();
            if (numeroIntroducir >= 0) {
                listaNum.add(numeroIntroducir);
            }
        } while (numeroIntroducir > 0);
    }

    //Mostramos el contenido de la lista
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Contenido de la lista: " + lista);
    }

    //Comparamos los numeros que sean pares con el minimo de la lista
    public static int mayorPar(ArrayList<Integer> lista) {
        int mayor = Integer.MIN_VALUE;
        for (int n : lista) {
            if (n % 2 == 0 && n > mayor) {
                mayor = n;
            }
        }
        return mayor;
    }

    //Comparamops los numeros pares con el mayor de la lista
    public static int menorImpar(ArrayList<Integer> lista) {
        int menor = Integer.MAX_VALUE;
        for (int n : lista) {
            if (n % 2 != 0 && n < menor) {
                menor = n;
            }
        }
        return menor;
    }
    //Comprobamos q las posiciones existen, si es asi las intercambiamos.
    public static void intercambiar(ArrayList<Integer> lista, int par, int impar) {
        int posPar = -1;
        int posImpar = -1;

        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == par) {
                posPar = i;
            }
            if (lista.get(i) == impar) {
                posImpar = i;
            }
        }

        
        if (posPar != -1 && posImpar != -1) {
            int temp = lista.get(posPar);
            lista.set(posPar, lista.get(posImpar));
            lista.set(posImpar, temp);
        }
    }

}
