/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_EJ14 {

    /**
     * @param args the command line arguments
     */
    
    //Llamada al menu y creacion de la lista
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        menu(alumnos);
    }

    
    public static void menu(ArrayList<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Introducir un nuevo alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mostrar el mejor alumno");
            System.out.println("4. Asignatura más difícil");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    rellenar(alumnos);
                    break;

                case 2:
                    mostrar(alumnos);
                    break;

                case 3:
                    mejorAlumno(alumnos);
                    break;

                case 4:
                    asignaturaDificil(alumnos);
                    break;

                case 5:
                    
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);
    }
    //Rellenamos datos de la lista 
    public static void rellenar(ArrayList<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        System.out.print("Nota de Lengua: ");
        asignaturas.add(new Asignatura("Lengua", sc.nextFloat()));
        System.out.print("Nota de Matemáticas: ");
        asignaturas.add(new Asignatura("Matemáticas", sc.nextFloat()));
        System.out.print("Nota de Física: ");
        asignaturas.add(new Asignatura("Física", sc.nextFloat()));
        Asignatura[] arrayAsignaturas = asignaturas.toArray(new Asignatura[0]);
        alumnos.add(new Alumno(nombre, arrayAsignaturas)); 
    }
    //Mostramos la lista de los alumnos
    public static void mostrar(ArrayList<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos.");
            return;
        }
        for (Alumno a : alumnos) {
            System.out.println("\nAlumno: " + a.getNombreAl());
            for (Asignatura as : a.getNotas()) {
                System.out.println(" - " + as.getNombre() + ": " + as.getNotaAsig());
            }
        }
    }
    //Selecionamos al mejor alumnio
    public static void mejorAlumno(ArrayList<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos.");
            return;
        }
        Alumno mejor = alumnos.get(0);
        for (Alumno a : alumnos) {
            if (a.notaMedia() > mejor.notaMedia()) {
                mejor = a;
            }
        }
        System.out.println("El mejor aluno es " + mejor.getNombreAl() + " con media " + mejor.notaMedia());
    }
    //Mostramos la asignatura cuya nota es mas baja por lo cual mas dificil
    public static void asignaturaDificil(ArrayList<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos.");
            return;
        }
        int suspLengua = 0, suspMates = 0, suspFisica = 0;
        for (Alumno a : alumnos) {
            for (Asignatura as : a.getNotas()) {
                if (as.estaSuspensa()) {
                    switch (as.getNombre()) {
                        case "Lengua":
                            suspLengua++;
                            break;
                        case "Matemáticas":
                            suspMates++;
                            break;
                        case "Física":
                            suspFisica++;
                            break;
                    }
                }
            }
        }
        String dificil = "Lengua";
        int max = suspLengua;
        if (suspMates > max) {
            dificil = "Matemáticas";
            max = suspMates;
        }
        if (suspFisica > max) {
            dificil = "Física";
            max = suspFisica;
        }
        System.out.println("La asignatura más difícil es " + dificil + " con " + max + " suspensos.");
    }
}
