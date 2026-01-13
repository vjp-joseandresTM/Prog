/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej7;


/**
 *
 * @author DAM
 */
public class T7_Ej7 {

    /**
     * @param args the command line arguments
     */
    
    //Creacion de variables y llamadas a los metodos
    public static void main(String[] args) {
        int[] numeros = new int[15];
        genNumeros(numeros);
        ordenar(numeros);
    }
    //Genero numeros aleatorios en el rango de 0 y 50 usando math random
    public static void genNumeros(int[] numero) {
        for (int i = 0; i < 15; i++) {
            numero[i] = (int) (Math.random() * 50);
            System.out.println("numero" + numero[i]);
        }
    }
    //Ordeno los numeros generados para obtener los mas grandes.
    public static void ordenar(int[] numero) {
        for (int j = 0; j < 10; j++) {//Se recorre 10 veces para scar los 10 que son pedidos.
            int max = numero[0];
            int pos = 0;

            for (int i = 1; i < numero.length; i++) {//Recorre todos los numeros  del array para hacer la comparacion.
                if (numero[i] > max) {
                    max = numero[i];
                    pos = i;
                }
            }

            System.out.println(max);
            numero[pos] = -1; // Toma la posicion y la pone en -1 para evitar que vuelva a salir
        }
    }
}
