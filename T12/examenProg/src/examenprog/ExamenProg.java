/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Deportes> lisDeportes = new ArrayList<>();
        HashSet<Equipos> equipSet = new HashSet<>();
        menu(lisDeportes, equipSet);

        //Declaramos las listas y set (Los equipos deberian ir en la clase deportes pero me he quedado congelado y no me acordaba de pasarlo)
    }

    //Menu que llama a los metodos
    public static void menu(ArrayList<Deportes> lisDeportes, HashSet<Equipos> equipSet) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Añadir deporte.");
            System.out.println("2. Mostrar deportes y equipos.");
            System.out.println("3. Buscar equipo");
            System.out.println("4. Mostrar mapa de equipos");
            System.out.println("5. Mostrar ordenados.");
            System.out.println("7. Salir.");
            System.out.println("==============================");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    addDep(lisDeportes, equipSet);
                    break;
                case 2:
                    mostrarEquip(lisDeportes, equipSet);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opcion != 7);

    }

    //Metodo que añade los deportes y los equipos
    public static void addDep(ArrayList<Deportes> lisDeportes, HashSet<Equipos> equipSet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de deporte: ");
        String nomDep = sc.nextLine();

        Deportes d = new Deportes(nomDep);
        lisDeportes.add(d);

        boolean salir = false;
        while (salir == false) {
            System.out.println("Introduce el codigo del equipo: ");
            String cod = sc.nextLine();
            System.out.println("Introduce el nombre del equipo: ");
            String nom = sc.nextLine();
            System.out.println("Introduce el numero de trofeos: ");
            int trof = sc.nextInt();

            Equipos e = new Equipos(cod, nom, trof);
            equipSet.add(e);

            System.out.println("Quiere seguir añadiendo escribe SI");
            String opcion = sc.nextLine();
            if (!opcion.equalsIgnoreCase("si")) {
                salir = true;
            }
        }
    }

    //Metodo que muestra los deportes y los equipos recorriendolos mediante for each.
    public static void mostrarEquip(ArrayList<Deportes> lisDeportes, HashSet<Equipos> equipSet) {
        for (Deportes dp : lisDeportes) {
            System.out.println(dp);
        }

        for (Equipos eq : equipSet) {
            System.out.println(eq);
        }
    }

}
