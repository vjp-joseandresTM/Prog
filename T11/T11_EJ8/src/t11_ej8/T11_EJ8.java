/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator;

/**
 *
 * @author DAM
 */
public class T11_EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        menu(ciudades);
    }
    //Menu que llama a los metodos que usaremos posteriormente.
    public static void menu(ArrayList<Ciudad> ciudades) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir ciudad");
            System.out.println("2. Mostrar ciudades y sedes");
            System.out.println("3. Sedes con ingresos superiores a la media");
            System.out.println("4. Buscar sede por nombre");
            System.out.println("5. Añadir sede a una ciudad");
            System.out.println("6. Mostrar sedes ordenadas por ingresos");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    anadirCiudad(ciudades);
                case 2 ->
                    mostrarCiudades(ciudades);
                case 3 ->
                    sedesSuperanMedia(ciudades);
                case 4 ->
                    buscarSede(ciudades);
                case 5 ->
                    anadirSede(ciudades);
                case 6 ->
                    sedesOrdenadas(ciudades);
            }

        } while (opcion != 7);
    }
    //Añadimos las ciudades y la informacion
    public static void anadirCiudad(ArrayList<Ciudad> ciudades) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la ciudad: ");
        String nombre = sc.nextLine();

        Ciudad c = new Ciudad(nombre);

        String seguir;
        do {
            System.out.print("Nombre de la sede: ");
            String sedeNombre = sc.nextLine();
            System.out.print("Ingresos anuales: ");
            double ingresos = sc.nextDouble();
            sc.nextLine();

            c.addSede(new Sede(sedeNombre, ingresos));

            System.out.print("¿Añadir otra sede? (s/n): ");
            seguir = sc.nextLine();
        } while (seguir.equalsIgnoreCase("s"));

        ciudades.add(c);
    }

    public static void mostrarCiudades(ArrayList<Ciudad> ciudades) {
        for (Ciudad c : ciudades) {
            System.out.println(c);
        }
    }
    
    //Buscamos las sedes que superan la media de ingresos
    public static void sedesSuperanMedia(ArrayList<Ciudad> ciudades) {
        double suma = 0;
        int contador = 0;

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                suma += s.getIngresos();
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No hay sedes registradas.");
            return;
        }

        double media = suma / contador;
        System.out.println("Media de ingresos: " + media);

        System.out.println("Sedes con ingresos superiores a la media:");
        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                if (s.getIngresos() > media) {
                    System.out.println(" - " + s.getNombre() + " (" + s.getIngresos() + ")");
                }
            }
        }
    }
    //Retornamos verdadero o falso si existen la sede buscadas
    public static boolean buscarSede(ArrayList<Ciudad> ciudades) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la sede a buscar: ");
        String nombre = sc.nextLine();

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                if (s.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Encontrada en la ciudad: " + c.getNombre());
                    return true;
                }
            }
        }

        System.out.println("No existe esa sede.");
        return false;
    }
    //Añadimos las sedes 
    public static void anadirSede(ArrayList<Ciudad> ciudades) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la ciudad: ");
        String nombre = sc.nextLine();

        for (Ciudad c : ciudades) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {

                System.out.print("Nombre de la nueva sede: ");
                String sedeNombre = sc.nextLine();
                System.out.print("Ingresos anuales: ");
                double ingresos = sc.nextDouble();
                sc.nextLine();

                c.addSede(new Sede(sedeNombre, ingresos));
                System.out.println("Sede añadida.");
                return;
            }
        }

        System.out.println("La ciudad no existe.");
    }

    // Mostrar sedes ordenadas por ingresos
    public static void sedesOrdenadas(ArrayList<Ciudad> ciudades) {
        ArrayList<Sede> lista = new ArrayList<>();

        for (Ciudad c : ciudades) {
            lista.addAll(c.getSedes());
        }

        lista.sort(Comparator.comparingDouble(Sede::getIngresos).reversed());

        System.out.println("Sedes ordenadas por ingresos:");
        for (Sede s : lista) {
            System.out.println(s);
        }
    }
}
