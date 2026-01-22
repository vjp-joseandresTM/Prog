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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        int[][] notas = new int[6][4];
        menu(alumnos, asignaturas, notas);
    }

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

                    break;
                case 6:

                    break;

            }

        } while (opcion != 6);
    }

    public static void rellenarNotas(String[] alumnos, String[] asignaturas, int[][] notas, Scanner sc) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("Nota de " + asignaturas[j] + ": ");
                notas[i][j] = sc.nextInt();
            }

        }

    }

    public static void mostrarNotas(String[] alumnos, String[] asignaturas, int[][] notas, Scanner sc) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("Nota de " + asignaturas[j] + ": " + notas[i][j]);

            }

        }
        System.out.println("\n");
    }

    public static void masNota(String[] alumnos, String[] asignaturas, int[][] notas) {
        int mejor = -1;
        String mejorAlumno = "";
        for (int i = 0; i < alumnos.length; i++) {
            int aux = 0;
            for (int j = 0; j < notas[i].length; j++) {
                aux = aux +notas[i][j];
                notas[i][j] = notas[i][j] + aux;
            }
            int media = aux / notas[i].length;
            if(media>mejor){
                mejor = media;
                mejorAlumno = alumnos[i];
            }
        }
        System.out.println("El mejor alumno fue: "+ mejorAlumno+" cuya media es: "+ mejor);
    }
    
    public static void peorAsig(String[] alumnos, String[] asignaturas, int[][] notas){
        int suspensosMax = -1;
        String alumnoSuspenso = "";
        
        for (int i = 0; i < alumnos.length; i++) {
            int suspensos = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if(notas[i][j]<5){
                    suspensos++;
                }
            }
            if(suspensos > suspensosMax){
                suspensosMax = suspensos;
                alumnoSuspenso = alumnos[i];
            }
        }
        
        System.out.println("El alumno con mas suspensos fue: "+alumnoSuspenso+ "con "+suspensosMax+" asignaturas suspensas.");
        
    }
    
    

}
