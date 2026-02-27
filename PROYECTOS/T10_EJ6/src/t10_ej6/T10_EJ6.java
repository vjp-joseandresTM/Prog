/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static final String VERDE = "\u001B[32m";
    public static final String ROJO = "\u001B[31m";

    //Creacion del array y la lista y llamada al menu.
    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        menu(listaNum, meses);
    }
    //Llamada a los metodos y muestra una interfaz de menu.
    public static void menu(ArrayList<Integer> listaNum, String[] meses) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("1.Introducir las ventas de coches de cada uno de los 12 meses del año.");
            System.out.println("2.Mostrar las ventas introducidas en el punto anterior.");
            System.out.println("3.Mostrar las ventas introducidas al revés.");
            System.out.println("4.Que muestre la suma total de ventas del año.");
            System.out.println("5.Que muestre las ventas totales de los meses cuyo nombre contenga la letra a.");
            System.out.println("6.Que muestre el nombre del mes (o meses) con más ventas.");
            System.out.println("7.Salir del programa");
            System.out.println("\n");
            System.out.print("Introduce una opcion (1-7): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarVentas(listaNum, meses);
                    break;
                case 2:
                    mostrarVentas(listaNum, meses);
                    break;
                case 3:
                    mostrarVentasRev(listaNum, meses);
                    break;
                case 4:
                    sumaVentas(listaNum);
                    break;
                case 5:
                    sumaA(listaNum, meses);
                    break;
                case 6:
                    masVentas(listaNum, meses);
                    break;
                case 7:
                    System.out.println("Hasta la proxima...");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 7);

    }
    
    //Metodo que rellena la lista.
    public static void rellenarVentas(ArrayList<Integer> listaNum, String[] meses) {
        Scanner sc = new Scanner(System.in);
        int ventas;
        for (int i = 0; i < meses.length; i++) {
            System.out.println("Introduce las ventas de " + meses[i]);
            ventas = sc.nextInt();
            listaNum.add(ventas);
        }
    }
    //Mostramos la lista recorriendola.
    public static void mostrarVentas(ArrayList<Integer> listaNum, String[] meses) {

        if (!listaNum.isEmpty()) {
            for (int i = 0; i < meses.length; i++) {
                System.out.println(meses[i] + " -> " + listaNum.get(i) + VERDE);
            }
        } else {
            System.out.println("\n NO HAY NUMEROS EN LA LISTA" + ROJO);
        }

    }

    //Mostramos la lista recorriendola al reves.
    public static void mostrarVentasRev(ArrayList<Integer> listaNum, String[] meses) {

        if (!listaNum.isEmpty()) {
            for (int i = meses.length - 1; i >= 0; i--) {
                System.out.println(meses[i] + " -> " + listaNum.get(i));
            }
        } else {
            System.out.println("\n NO HAY NUMEROS EN LA LISTA");
        }

    }

    //Sumamos todas las ventas.
    public static void sumaVentas(ArrayList<Integer> listaNum) {
        int suma = 0;
        if (!listaNum.isEmpty()) {
            for (int i = 0; i < listaNum.size(); i++) {
                suma += listaNum.get(i);

            }
        } else {
            System.out.println("\n NO HAY NUMEROS EN LA LISTA");
        }
        System.out.println("\n Las ventas anuales fueron: " + suma);

    }
    //Mostramos las ventas que contengan una a en los meses
    public static void sumaA(ArrayList<Integer> listaNum, String[] meses) {
        int suma = 0;
        if (!listaNum.isEmpty()) {
            for (int i = 0; i < listaNum.size(); i++) {
                if (meses[i].toLowerCase().contains("a")) {
                    suma += listaNum.get(i);
                }

            }
        } else {
            System.out.println("\n NO HAY NUMEROS EN LA LISTA");
        }
        System.out.println("\n Las ventas anuales fueron: " + suma);
    }
    
    //Mostramos el mes con mas ventas
    public static void masVentas(ArrayList<Integer> listaNum, String[] meses) {
        int suma = 0;
        if (!listaNum.isEmpty()) {
            int max = listaNum.get(0);
            for (int i = 1; i < listaNum.size(); i++) {
                if (listaNum.get(i) > max) {
                    max = listaNum.get(i);
                }
            }
            for (int i = 0; i < listaNum.size(); i++) {
                if (listaNum.get(i) == max) {
                    System.out.println("- " + meses[i]);
                }
            }

        } else {
            System.out.println("\n NO HAY NUMEROS EN LA LISTA");
        }
        System.out.println("\n Las ventas anuales fueron: " + suma);
    }
}
