/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej19;

/**
 *
 * @author DAM
 */
public class T7_EJ19 {

    /**
     * @param args the command line arguments
     */
    //Creamos el array y llamamos a los metodos necesarios.
    public static void main(String[] args) {
        int[] numero = new int[100];
        generarAle(numero);
        mostrarArray(numero);
        numMayor(numero);
        numMenor(numero);
        media(numero);
    }

    //Generamos los numeros aleatorios.
    public static void generarAle(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 71) + 10;
        }
    }

    //Mostramos los numeros generados.
    public static void mostrarArray(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println("\n");
    }

    //Buscamos el numero mayor.
    public static void numMayor(int[] numero) {
        int mayor = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (mayor < numero[i]) {
                mayor = numero[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    //Buscamos el numero menor.
    public static void numMenor(int[] numero) {
        int menor = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (menor > numero[i]) {
                menor = numero[i];
            }
        }
        System.out.println("El mayor es: " + menor);
    }

    //Calculamos la media
    public static void media(int[] numero) {
        int suma = 0;

        for (int i = 0; i < numero.length; i++) {

            suma = suma + numero[i];

        }

        int media = suma / numero.length;
        System.out.println("La media es: " + media);
    }

}
