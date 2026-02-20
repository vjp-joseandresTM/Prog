/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edrepaso1;

/**
 *
 * @author DAM
 */
public class Edrepaso1 {

    public final int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /**
     * @param args the command line arguments
     */

    public int busquedaBinaria(int numero) {
        int umbral_inferior = 0;
        int umbral_superior = array.length - 1;//Nodo1
        int respuesta = -1;
        int index;

        while (umbral_inferior <= umbral_superior) {//Nodo2
            index = (umbral_inferior + umbral_superior) / 2;//Nodo 3

            if (array[index] == numero) {//Nodo 4
                respuesta = index;
                umbral_inferior = umbral_superior + 1;//Nodo 5
            } else if (array[index] < numero) {//Nodo 6
                umbral_inferior = index + 1;//Nodo 7
            } else {//Nodo 8
                umbral_superior = index - 1;//Nodo 9
            }
        }
        return respuesta;//Nodo 10
    }

}
