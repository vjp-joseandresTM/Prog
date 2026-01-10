/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej15;

import java.util.Random;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author DAM
 */
public class T7_Ej15 {

    /**
     * @param args the command line arguments
     */
    //Solo llama al menu
    public static void main(String[] args) {
        menu();
    }
    //Creamos el menu con las opciones y las llamadas a metodos.
    public static void menu() {
        int[] ventas = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=-=-= MENU =-=-=");
            System.out.println("1.Rellenar array");
            System.out.println("2.Mostrar ventas");
            System.out.println("3.Ventas al reves");
            System.out.println("4.Suma total de ventas");
            System.out.println("5.Ventas de meses pares");
            System.out.println("6.Mes con mas ventas");

            System.out.print("Introduce la opcion a elegir: ");
            opcion = sc.nextInt();

            System.out.println("");

            System.out.println("=-=-=-=-=-=-=-=-=");
            switch (opcion) {
                case 1:
                    ventasMensuales(ventas);
                    break;
                case 2:
                    mostrarVentas(ventas);
                    break;
                case 3:
                    mostrarVentasReves(ventas);
                    break;
                case 4:
                    sumaVentas(ventas);
                    break;
                case 5:
                    mostrarVentasPares(ventas);
                    break;
                case 6:
                    mesMasVentas(ventas, meses);
                    break;
                case 7:

                    break;

                default:
                    System.out.println("Numero no reconocido");
                    break;
            }

        } while (opcion != 0);
    }
    //Metodo que genera las ventas de cada mes
    public static void ventasMensuales(int[] ventas) {

        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 91) + 10;
        }

    }
    //Metodo que muestra las ventas de los meses
    public static void mostrarVentas(int[] ventas) {

        System.out.println("No se han creado las ventas");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(ventas[i]);
        }

    }
    //Mostramos las ventas de todo el año(Total)
    public static void sumaVentas(int[] ventas) {
        int suma = 0;
        for (int v : ventas) {
            suma += v;
        }
        System.out.println("Total de ventas anuales: " + suma);
    }
    //Mostramos ventas en orden inverso
    public static void mostrarVentasReves(int[] ventas) {
        System.out.println("Ventas al revés:");
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(ventas[i]);
        }
    }
    //Mostramos solo las ventas pares
    public static void mostrarVentasPares(int[] ventas) {

        for (int i = 0; i < 10; i++) {
            if (ventas[i] % 2 == 0) {
                System.out.println(ventas[i]);
            }
        }
    }
    //Mostramos el mes con mas ventas
    public static void mesMasVentas(int[] ventas, String[] meses) {
        int max = ventas[0];
        int pos = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                pos = i;
            }
        }
        System.out.println("Mes con más ventas: " + meses[pos] + " (" + max + ")");
    }
}
