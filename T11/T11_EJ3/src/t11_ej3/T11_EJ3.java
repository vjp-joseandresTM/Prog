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
    
    //Creamos un array con las Dársenas de l bus
    public static void main(String[] args) {
        Autobus[] darsenas = new Autobus[6];
        menuPrincipal(darsenas);
    }
    //Menu con que llama a los metodos necesarios
    public static void menuPrincipal(Autobus[] darsenas) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU AUTOBUSES ---");
            System.out.println("1. Aparcar autobus");
            System.out.println("2. Mostrar darsenas libres");
            System.out.println("3. Buscar autobu por matricula");
            System.out.println("4. Buscar conductor");
            System.out.println("5. Autobus con mas conductores");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
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
    //Metodo aparcar que busca una posicion libre en el rango predeterminado y permite rellenar de conductores a un bus.               
    public static void aparcar(Autobus[] darsenas) {
        Scanner sc = new Scanner(System.in);
        int pos;

        do {
            System.out.print("Introduce posicion (0-5): ");
            pos = sc.nextInt();
            sc.nextLine();
        } while (pos < 0 || pos > 5 || darsenas[pos] != null);

        System.out.print("Matricula del autobus: ");
        String mat = sc.nextLine();

        Autobus a = new Autobus(mat);

        String seguir;
        do {
            System.out.print("DNI conductor: ");
            String dni = sc.nextLine();
            System.out.print("Nombre conductor: ");
            String nombre = sc.nextLine();

            a.addConductor(new Conductor(dni, nombre));

            System.out.print("¿Quiere añadirr otro conductor? (s/n): ");
            seguir = sc.nextLine();
        } while (seguir.equalsIgnoreCase("s"));

        darsenas[pos] = a;
    }
    //Mostramos las posiciones libres del bus
    public static void mostrarLibres(Autobus[] darsenas) {
        System.out.println("Darsenas libres:");
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
