/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAM
 */
public class T11_EJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();
        menu(alumnos);
    }

    public static void menu(Set<Alumno> alumnos) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE OPCIONES =====");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Mostrar alumnos ordenados por expediente");
            System.out.println("3. Buscar alumno por expediente");
            System.out.println("4. Mostrar alumnos ordenados por nota");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    añadirAlumno(alumnos);
                    break;

                case 2:
                    mostrarPorExpediente(alumnos);
                    break;

                case 3:
                    buscarPorExpediente(alumnos);
                    break;

                case 4:
                    mostrarPorNota(alumnos);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    //Metodo añadir al alumno
    public static void añadirAlumno(Set<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Número de expediente: ");
        int exp = sc.nextInt();

        System.out.print("Nota media: ");
        float nota = sc.nextFloat();

        Alumno nuevo = new Alumno(dni, exp, nota);
        //Comprobar si el expediente es el mismo para dejar o no añadirlo
        if (alumnos.add(nuevo)) {
            System.out.println("Alumno añadido correctamente.");
        } else {
            System.out.println("Ya existe un alumno con ese expediente.");
        }
    }

    //Mostrar por orden de expediente
    public static void mostrarPorExpediente(Set<Alumno> alumnos) {
        List<Alumno> lista = new ArrayList<>(alumnos);
        Collections.sort(lista);

        System.out.println("\n--- Alumnos ordenados por expediente ---");
        lista.forEach(System.out::println);
    }

    //Busqueda por expediente
    public static void buscarPorExpediente(Set<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce expediente: ");
        int exp = sc.nextInt();

        Iterator<Alumno> it = alumnos.iterator();
        boolean encontrado = false;

        while (it.hasNext() && !encontrado) {
            Alumno a = it.next();

            if (a.getExpediente() == exp) {
                System.out.println("Alumno encontrado: " + a);
                encontrado = true;   
            }
        }

        if (!encontrado) {
            System.out.println("No existe un alumno con ese expediente.");
        }
    }
    
    //Ordenar la lista por nota de peor a mejor
    public static void mostrarPorNota(Set<Alumno> alumnos) {
        List<Alumno> lista = new ArrayList<>(alumnos);
        lista.sort(Comparator.comparing(Alumno::getNotaMedia));

        System.out.println("\n--- Alumnos ordenados por nota ---");
        lista.forEach(System.out::println);
    }
}
