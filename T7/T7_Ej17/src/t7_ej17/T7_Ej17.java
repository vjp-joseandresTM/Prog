/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej17;

import javax.print.attribute.standard.NumberOfDocuments;

/**
 *
 * @author alumno
 */
public class T7_Ej17 {

    /**
     * @param args the command line arguments
     */
    
    //Creacion del array y llamada a los metodos
    public static void main(String[] args) {
        int[] numeros = new int[10];
        String[] posicion = {"Primera", "Segunda", "Tercera", "Cuarta", "Quinta", "Sexta", "Septima", "Octava", "Novena", "Decima"};
        generar(numeros);
        mostrar(numeros, posicion);
        System.out.println("\n");
        ordenar(numeros);
        System.out.println("Ahora ordenados");
        System.out.println("\n");
        mostrar(numeros, posicion);
    }
    //Generador de numeros aleatorios.
    public static void generar(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10);
        }
    }
    //Mostramos el array en el que hemos guardado los valores antes.
    public static void mostrar(int[] numero, String[] posicion) {
        for (int i = 0; i < numero.length; i++) {
            System.out.println(posicion[i] + " posicion -> " + numero[i]);
        }
    }
    //Ordenamos el array que antes hemos mostrado.
    public static void ordenar(int[] numero) {
        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if (numero[j] < numero[j + 1]) {
                    int aux = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = aux;
                }

            }
        }
    }

}
