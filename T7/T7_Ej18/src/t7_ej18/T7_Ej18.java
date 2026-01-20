/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej18;

/**
 *
 * @author DAM
 */
public class T7_Ej18 {

    /**
     * @param args the command line arguments
     */
    //Generamos los array y mostramos los originales y luego el resultado.
    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = (int) (Math.random() * 100);
            array2[i] = (int) (Math.random() * 100);
        }

        int[] resultado = unirYOrdenar(array1, array2);

        System.out.print("Array 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.print("\nArray 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i] + " ");
        }

       
        System.out.print("\nResultado ordenado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
    
    //Unimos los resultados de los array y los ordenamos gracias al metodo burbuja
    public static int[] unirYOrdenar(int[] a, int[] b) {
        int[] resultado = new int[10];
        int k = 0;

        // Unir arrays
        for (int i = 0; i < 5; i++) {
            resultado[k++] = a[i];
        }
        for (int i = 0; i < 5; i++) {
            resultado[k++] = b[i];
        }

        // Ordenamos con burbuja
        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    int aux = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = aux;
                }
            }
        }

        return resultado;
    }

}
