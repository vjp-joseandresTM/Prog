/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej11;

/**
 *
 * @author DAM
 */
public class T7_Ej11 {

    /**
     * @param args the command line arguments
     */
    //Creamos variables y llamamos a los metodos.
    public static void main(String[] args) {
        int[] numeros = new int[10];
        rellenar(numeros);
        mostrar(numeros);
    }
    //Generamos los numeros y hacemos la comprobacion de si son repetidos
    public static void rellenar(int[] numeros) {
        int i = 0;
        while (i < numeros.length) { //Al saber el numero de interacciones seria mejor usar For. TOMAR APUNTE
            int aleatorio = (int) (Math.random() * 10); // 0 a 9
            boolean repetido = false;

            for (int j = 0; j < i && !repetido; j++) {
                if (numeros[j] == aleatorio) {
                    repetido = true;//Paro el bucle (CAMBIAR)
                }
            }

            if (!repetido) {
                numeros[i] = aleatorio;
                i++;
            }
        }

    }
    //Imprimimos los numeros por pantalla, pasando por todo el array.
    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
