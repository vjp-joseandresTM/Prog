package ejercicio14_t4;

import java.util.Scanner;

public class Ejercicio14_T4 {

    public static void main(String[] args) {
        int numero = pedirNumero();          // Pedir número válido
        mostrarMultiplosDeTres(numero);      // Mostrar múltiplos de 3
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce el número: ");
            numero = entrada.nextInt();

            if (!esValido(numero)) {
                System.err.println("Debe ser mayor que 0"); // Mensaje error
            }

        } while (!esValido(numero)); // Repetir hasta ser válido

        return numero; // Devolver número
    }

    public static boolean esValido(int numero) {
        return numero > 0; // Comprobar si es mayor que 0
    }

    public static void mostrarMultiplosDeTres(int numero) {
        int contador = 0;

        for (int i = 1; i <= numero; i++) { // Recorrer hasta el número
            if (i % 3 == 0) {               // Si es múltiplo de 3
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Los múltiplos de 3 inpresos fueron: " + contador); // Total
    }
}
