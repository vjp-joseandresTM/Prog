/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ej13.pkg14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T8_EJ1314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Alumno a1 = new Alumno();
        a1.setNombre("Tania");
        a1.setEdad(25);
        a1.setNotaMedia(7);
        a1.mostrarAlumno();

        Alumno a2 = new Alumno("Pepe", 19, 8.5);
        a2.mostrarAlumno();

        //Ampliacion del Ejercicio 14.
        Alumno[] clase = new Alumno[5];
        menu(clase);

    }

    //Menu
    public static void menu(Alumno[] clase) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ ALUMNOS ---");
            System.out.println("1. Rellenar alumnos");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mostrar alumnos por encima de la media");
            System.out.println("4. Mostrar alumnos con media suspensa");
            System.out.println("5. Buscar si esta matriculado");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    rellenarAlumno(clase);
                    break;
                case 2:
                    mostrarAlumno(clase);
                    break;
                case 3:
                    mediaPorEncima(clase);
                    break;
                case 4:
                    suspensos(clase);
                    break;
                case 5:
                    buscador(clase);
                    break;
                case 6:
                    System.out.println("Gracias por usar... Adios!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 6);
    }

    //Metodo que rellena el alumno en x posicion
    public static void rellenarAlumno(Alumno[] clase) {
        Scanner sc = new Scanner(System.in);
        int pos;

        do {
            System.out.print("Introduce posición (0-4): ");
            pos = sc.nextInt();
        } while (pos < 0 || pos >= clase.length || clase[pos] != null);

        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Nota media: ");
        double nota = sc.nextDouble();

        clase[pos] = new Alumno(nombre, edad, nota);
        System.out.println("Alumno en posicion: [" + pos + "] creado correctamente");
    }

    //Mostramos los alumnos RELLENADOS.
    public static void mostrarAlumno(Alumno[] clase) {
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] != null) {
                clase[i].mostrarAlumno();
            }
        }
    }

    //Buscamos solo los alumnos q tengan la media por encima de la que introduzcamos
    public static void mediaPorEncima(Alumno[] clase) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la media que buscas: ");
        double media = sc.nextDouble();

        for (Alumno al : clase) {
            if (al != null && al.getNotaMedia() > media) {
                al.mostrarAlumno();
            }
        }
    }

    //Mostramos los alumnos que estan suspensos
    public static void suspensos(Alumno[] clase) {
        for (Alumno al : clase) {
            if (al != null && al.getNotaMedia() < 5) {
                al.mostrarAlumno();
            }
        }
    }

    //Buscamos los alumnos que estan matriculados.
    public static void buscador(Alumno[] clase) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno a buscar: ");
        String buscarNomb = sc.nextLine();
        boolean encontrado = false;
        int i = 0;
        while (i < clase.length && !encontrado) {
            if (clase[i] != null && clase[i].getNombre().equalsIgnoreCase(buscarNomb)) {
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado) {
            System.out.println("El alumno está matriculado.");

        } else {
            System.out.println("El alumno NO está matriculado.");
        }
    }

}
