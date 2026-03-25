/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej6;

import java.util.Scanner;

public class T11_EJ6 {

    public static void main(String[] args) {

        GestorCampania gestor = new GestorCampania();
        menu(gestor);
    }

    public static void menu(GestorCampania gestor) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE OPCIONES =====");
            System.out.println("1. Añadir campaña");
            System.out.println("2. Añadir donación");
            System.out.println("3. Mostrar campañas con donaciones");
            System.out.println("4. Mostrar campaña por nombre");
            System.out.println("5. Mostrar total dinero recaudado");
            System.out.println("6. Mostrar mayor donación");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    añadirCampaña(gestor);
                    break;

                case 2:
                    añadirDonacion(gestor);
                    break;

                case 3:
                    mostrarCampañas(gestor);
                    break;

                case 4:
                    mostrarCampañaPorNombre(gestor);
                    break;

                case 5:
                    mostrarTotalRecaudado(gestor);
                    break;

                case 6:
                    mostrarMayorDonacion(gestor);
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }

    //Metodo que añade una nueva campaña
    public static void añadirCampaña(GestorCampania gestor) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la campaña: ");
        String nombre = sc.nextLine();
        gestor.añadirCampaña(nombre);
    }
    //A una campaña existente le añadimos una donacion
    public static void añadirDonacion(GestorCampania gestor) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la campaña: ");
        String nombreCamp = sc.nextLine();

        Campania c = gestor.buscarCampaña(nombreCamp);

        if (c == null) {
            System.out.println("La campaña no existe.");
            return;
        }

        System.out.print("Nombre del donante: ");
        String donante = sc.nextLine();

        System.out.print("Cantidad donada: ");
        int cantidad = sc.nextInt();

        c.añadirDonacion(new Donacion(donante, cantidad));
    }
    //Muestra las campañas.
    public static void mostrarCampañas(GestorCampania gestor) {
        gestor.mostrarCampañas();
    }
    //Buscador basicamente
    public static void mostrarCampañaPorNombre(GestorCampania gestor) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la campaña: ");
        String nombre = sc.nextLine();

        Campania c = gestor.buscarCampaña(nombre);

        if (c == null) {
            System.out.println("No existe esa campaña.");
        } else {
            System.out.println("\nCampaña: " + c.getNombre());
            c.mostrarDonaciones();
        }
    }
    //Suma todo lo recaudado de las campañas
    public static void mostrarTotalRecaudado(GestorCampania gestor) {
        System.out.println("Total recaudado: " + gestor.totalRecaudado() + " euros");
    }
    //Muestra la mayor donacion
    public static void mostrarMayorDonacion(GestorCampania gestor) {
        Donacion mayor = gestor.mayorDonacion();

        if (mayor == null) {
            System.out.println("No hay donaciones registradas.");
        } else {
            System.out.println("Mayor donación: " + mayor);
        }
    }
}
