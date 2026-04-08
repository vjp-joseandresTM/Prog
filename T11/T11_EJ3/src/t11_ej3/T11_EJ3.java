/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej3;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T11_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobus[] darsenas = new Autobus[6];
        menuPrincipal(darsenas);
    }

    public static void menuPrincipal(Autobus[] darsenas) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ AUTOBUSES ---");
            System.out.println("1. Aparcar autobús");
            System.out.println("2. Mostrar dársenas libres");
            System.out.println("3. Buscar autobús por matrícula");
            System.out.println("4. Buscar conductor");
            System.out.println("5. Autobús con más conductores");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    aparcar(darsenas);
                case 2 ->
                    mostrarLibres(darsenas);
                case 3 ->
                    buscarAutobus(darsenas);
                case 4 ->
                    buscarConductor(darsenas);
                case 5 ->
                    mostrarMayorConductores(darsenas);
            }
        } while (opcion != 6);
    }

    public static void aparcar(Autobus[] darsenas) {
        Scanner sc = new Scanner(System.in);
        int pos;

        do {
            System.out.print("Introduce posición (0-5): ");
            pos = sc.nextInt();
            sc.nextLine();
        } while (pos < 0 || pos > 5 || darsenas[pos] != null);

        System.out.print("Matrícula del autobús: ");
        String mat = sc.nextLine();

        Autobus a = new Autobus(mat);

        String seguir;
        do {
            System.out.print("DNI conductor: ");
            String dni = sc.nextLine();
            System.out.print("Nombre conductor: ");
            String nombre = sc.nextLine();

            a.addConductor(new Conductor(dni, nombre));

            System.out.print("¿Añadir otro conductor? (s/n): ");
            seguir = sc.nextLine();
        } while (seguir.equalsIgnoreCase("s"));

        darsenas[pos] = a;
    }

    public static void mostrarLibres(Autobus[] darsenas) {
        System.out.println("Dársenas libres:");
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println(" - Posición " + i);
            }
        }
    }

    public static void buscarAutobus(Autobus[] darsenas) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce matrícula: ");
        String mat = sc.nextLine();

        for (Autobus a : darsenas) {
            if (a != null && a.getMatricula().equalsIgnoreCase(mat)) {
                System.out.println(a);
                return;
            }
        }
        System.out.println("No existe un autobús con esa matrícula.");
    }

    public static void buscarConductor(Autobus[] darsenas) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce DNI del conductor: ");
        String dni = sc.nextLine();

        for (Autobus a : darsenas) {
            if (a != null && a.getConductores().containsKey(dni)) {
                System.out.println("El conductor está en el autobús con matrícula: " + a.getMatricula());
                return;
            }
        }
        System.out.println("No se ha encontrado ese conductor.");
    }

    public static void mostrarMayorConductores(Autobus[] darsenas) {
        int posMax = -1;
        int max = -1;

        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int num = darsenas[i].getConductores().size();
                if (num > max) {
                    max = num;
                    posMax = i;
                }
            }
        }

        if (posMax == -1) {
            System.out.println("No hay autobuses aparcados.");
        } else {
            System.out.println("El autobús con más conductores está en la posición " + posMax);
        }
    }

}
