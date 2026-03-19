/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej6;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T11_EJ6 {

    /**
     * @param args the command line arguments
     */
    //Metodo principal crea una nueva campaña.
    public static void main(String[] args) {
        Campania camp = new Campania();
        menu(camp);
    }
    //Menu con opciones que llama a los metodos requeridos
    public static void menu(Campania camp) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU DE OPCIONES: ========================== ");
            System.out.println("1. Añadir donacion.");
            System.out.println("2. Mostrar donacion.");
            System.out.println("3. Mostrar donaciones por nombre de donante.");
            System.out.println("4. Mostrar numero de donaciones.");
            System.out.println("5. Mostrar dinero recaudado.");
            System.out.println("6. Ordenar donaciones.");
            System.out.println("7. Salir. ");
            System.out.println("============================================ ");
            System.out.print("\n Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    añadirDona(camp);
                    break;
                case 2:
                    mostrarDona(camp);
                    break;

                case 3:
                    mostrarPorNom(camp);
                    break;
                case 4:
                    numDon(camp);
                    break;
                case 5:
                    totalRecaudado(camp);
                    break;
                case 6:
                    ordenarDonaciones(camp);
                    break;
                case 7:
                    System.out.println("Adios...");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 7);
    }
    //Pedimos nombre y donacion y introducimos dentro de una nueva donacion la info 
    public static void añadirDona(Campania camp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de donante: ");
        String nomb = sc.nextLine();
        sc.nextLine();
        System.out.println("Cantidad: ");
        int cant = sc.nextInt();

        Donacion d = new Donacion(nomb, cant);
        camp.añadirDonacion(d);
    }
    //Mostramos las donaciones de la campaña
    public static void mostrarDona(Campania camp) {
        camp.mostrarDonaciones();
    }
    //Mostramos por nombre que el usuario ha introducido anteriormente.
    public static void mostrarPorNom(Campania camp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del donante: ");
        String nombre = sc.nextLine();
        camp.mostrarPorNombre(nombre);
    }
    //Mostramos el numero de donaciones de la campaña
    public static void numDon(Campania camp) {
        System.out.println("Número de donaciones: " + camp.numeroDonaciones());
    }
    
    //Mostramos el total recaudado de las campañas
    public static void totalRecaudado(Campania camp) {
        System.out.println("Total recaudado: " + camp.totalRecaudado() + " euros");
    }
    //Ordenamos las donaciones en sentido ascendente.
    public static void ordenarDonaciones(Campania camp) {
        camp.ordenarDonaciones();
    }

}
