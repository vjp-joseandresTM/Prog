/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_ed;

/**
 *
 * @author DAM
 */
public class EJ2_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayNumeros = {3, 2, 6, 7, 9};
        

    }
    
    public boolean burbuja(int[] arrayNumeros) {

    boolean ordenado = true;
    int elementoActual, elementoSiguiente;

    for (int x = 0; x < arrayNumeros.length; x++) {//Nodo 1
        for (int y = 0; y < arrayNumeros.length - 1; y++) {//Nodo 2
            elementoActual = arrayNumeros[y];//
            elementoSiguiente = arrayNumeros[y + 1];//Nodo3

            if (elementoActual > elementoSiguiente) {//Nodo 4
                arrayNumeros[y] = elementoSiguiente;
                arrayNumeros[y + 1] = elementoActual;//Nodo 5
                ordenado = false;
            }
        }
    }

    return ordenado;//Nodo 6
}

  
}
