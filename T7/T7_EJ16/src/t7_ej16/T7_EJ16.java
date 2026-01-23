/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej16;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T7_EJ16 {

    public static final int FIL = 6;
    public static final int COL = 4;

    /**
     * @param args the command line arguments
     */
    
    //Declaramos los arrays y llamamos al metodo encargado del menu.
    public static void main(String[] args) {
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        int[][] notas = new int[FIL][COL];
        menu(alumnos, asignaturas, notas);
    }
    //Muestra las opciones del menu y llama a los metodos dependiendo de la opcion selecionada.
    public static void menu(String[] alumnos, String[] asignaturas, int[][] notas) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Rellenar notas");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Mas suspensos");
            System.out.println("5. Asignatura mas dificil");
            System.out.println("6. Salir");
            System.out.println("\n"
                    + "");
            System.out.print("Introduce un numero: ");
            opcion = sc.nextInt();
            System.out.println("\n");

            switch (opcion) {
                case 1:
                    rellenarNotas(alumnos, asignaturas, notas, sc);
                    break;
                case 2:
                    mostrarNotas(alumnos, asignaturas, notas, sc);
                    break;
                case 3:
                    masNota(alumnos, asignaturas, notas);
                    break;
                case 4:
                    peorAsig(alumnos, asignaturas, notas);
                    break;
                case 5:
                    asignaturaDificil(asignaturas, notas);
                    break;
                case 6:
                    System.out.println("Saliendo del programa... ");
                    break;
                default:
                    System.out.println("Opcion no valida...");

            }

        } while (opcion != 6);
    }
    //Metodo que pedira al usuario las notas de los alumnos.
    public static void rellenarNotas(String[] alumnos, String[] asignaturas, int[][] notas, Scanner sc) {
        for (int i = 0; i < FIL; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            for (int j = 0; j < COL; j++) {
                System.out.println("Nota de " + asignaturas[j] + ": ");
                notas[i][j] = sc.nextInt();
            }

        }

    }
    //Muestra las notas que anteriormente el usuario indico.
    public static void mostrarNotas(String[] alumnos, String[] asignaturas, int[][] notas, Scanner sc) {
        for (int i = 0; i < FIL; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            for (int j = 0; j < COL; j++) {
                System.out.println("Nota de " + asignaturas[j] + ": " + notas[i][j]);

            }

        }
        System.out.println("\n");
    }
    //Muestra el alumno con mejores califikcaciones.
    public static void masNota(String[] alumnos, String[] asignaturas, int[][] notas) {
        int mejor = -1;
        String mejorAlumno = "";
        int aux;
        for (int i = 0; i < FIL; i++) {
            aux = 0;
            for (int j = 0; j < COL; j++) {
                aux = aux + notas[i][j];

            }
            int media = aux / notas[i].length;
            if (media > mejor) {
                mejor = media;
                mejorAlumno = alumnos[i];
            }
        }
        System.out.println("El mejor alumno fue: " + mejorAlumno + " cuya media es: " + mejor);
    }
    //Dice cual es el alumno con el numero maximo suspendido y cual debe mejorar.
    public static void peorAsig(String[] alumnos, String[] asignaturas, int[][] notas) {
        int suspensosMax = -1;
        String alumnoSuspenso = "";
        int suspensos;
        for (int i = 0; i < FIL; i++) {
            suspensos = 0;
            for (int j = 0; j < COL; j++) {
                if (notas[i][j] < 5) {
                    suspensos++;
                }
            }
            if (suspensos > suspensosMax) {
                suspensosMax = suspensos;
                alumnoSuspenso = alumnos[i];
            }
        }

        System.out.println("El alumno con mas suspensos fue: " + alumnoSuspenso + "con " + suspensosMax + " asignaturas suspensas.");

    }
    //Muestra la asigna con mas tasa de suspensos.
    public static void asignaturaDificil(String[] asignaturas, int[][] notas) {
        int asignaturaPeor = 500;
        String nombreDePeor = "";
        int suma;
        for (int j = 0; j < COL; j++) {
            suma = 0;

            for (int i = 0; i < FIL; i++) {
                suma = suma + notas[i][j];

            }
            int media = suma / COL;
            if (media < asignaturaPeor) {
                asignaturaPeor = media;
                nombreDePeor = asignaturas[j];
            }
        }

        System.out.println(nombreDePeor + " fue la asignatura mas dificil, con una media de " + asignaturaPeor);
    }

}
