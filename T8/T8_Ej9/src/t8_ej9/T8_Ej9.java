/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8_ej9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T8_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        String[] nombresAlumnos = {"Pepe", "Juan", "Marta"};
        genAlumn(alumnos, nombresAlumnos);
        menu(alumnos);
    }

    public static void genAlumn(Alumno[] alumnos, String[] nombresAlumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
            alumnos[i].setNombreAlumno(nombresAlumnos[i]);
            System.out.println(alumnos[i].getNombreAlumno());
        }

    }

    public static void menu(Alumno[] alumnos) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n ---- Menu de opciones ----");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar notas introducidas. ");
            System.out.println("3. Mejor alumno de la clase. ");
            System.out.println("4. Alumno con mas suspensos. ");
            System.out.println("5. Asignatura mas dificil. ");
            System.out.println("6. Salir del programa. ");
            System.out.println("\n");
            System.out.print("INTRODUCE UNA OPCION: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n OPCION 1");
                    rellenarNotas(alumnos);
                    break;
                case 2:
                    System.out.println("\n OPCION 2");
                    break;
                case 3:
                    System.out.println("\n OPCION 3");
                case 4:
                    System.out.println("\n OPCION 4");
                case 5:
                    System.out.println("\n OPCION 5");
                case 6:
                    System.out.println("Gracias por usar el programa... HASTA LUEGO!");
                default:
                    throw new AssertionError();
            }

        } while (opcion != 6);

    }

    public static void rellenarNotas(Alumno[] alumnos) {
        Scanner sc = new Scanner(System.in);
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        for (Alumno al : alumnos) {
            System.out.println("\n Alumno: " + al.getNombreAlumno());
            Asignatura[] notas = new Asignatura[4];
            
            for (int i = 0; i < asignaturas.length; i++) {
                System.out.print("Nota de " + asignaturas[i] + ": ");
                float nota = sc.nextFloat();

                notas[i] = new Asignatura(asignaturas[i], nota);
            }
            al.setNotas(notas);

        }
    }
    
    public static void mostrarNotas(Alumno[] alumnos){
        for(Alumno al: alumnos){
            System.out.println("\n Alumno:  "+ al.getNombreAlumno());
                    for(Asignatura a: al.getNotas()){
                        System.out.println(a.getNombreAsignatura()+ ": "+ al.getNotas());
        }
            
        }

    }

}
