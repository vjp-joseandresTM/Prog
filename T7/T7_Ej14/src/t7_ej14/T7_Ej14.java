/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ej14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7_Ej14 {
    //Declaramos constantes con Semanas y Dias para hacer moldeable el programa
    public static final int SEM = 4;
    public static final int DIAS = 7;

    /**
     * @param args the command line arguments
     */
    
    
    //Generamos variables de matriz y llamamos al menu
    public static void main(String[] args) {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int matriz[][] = new int[SEM][DIAS];
        menu(diasSemana, matriz);

    }
    
    //Creamos el menu que llama a los metodos que realizan las acciones.
    public static void menu(String[] diasSemana, int[][] matriz) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Rellenar temperaturas.");
            System.out.println("2. Mostrar temperaturas. ");
            System.out.println("3. Visualizar temperatura media del mes.");
            System.out.println("4. Dia o dias mas calurosos del mes.");
            System.out.println("5. SALIR DEL PROGRAMA.");
            System.out.println("\n "
                    + "Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    rellenarTemp(diasSemana, matriz);
                    break;
                case 2:
                    mostrarTemp(diasSemana, matriz);
                    break;
                case 3:
                    mediaMes(matriz);
                    break;
                case 4:
                    masCaluroso(matriz, diasSemana);
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA...");
                    break;

            }

        } while (opcion != 5);
    }
    //Metodo que rellena la temperatura
    public static void rellenarTemp(String[] diasSemana, int[][] matriz) {
        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIAS; j++) {
                matriz[i][j] = (int) (Math.random() * 46);

            }
        }
    }
    //Metodo con que gracias a la temperatura rellenaa la muestra.
    public static void mostrarTemp(String[] diasSemana, int[][] matriz) {
        System.out.println("\n");
        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIAS; j++) {
                System.out.println(matriz[i][j] + "º");
            }
        }
    }
    //Metodo que calcula la media.
    public static void mediaMes(int[][] matriz) {
        int suma = 0;
        int totalDias = SEM * DIAS;

        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIAS; j++) {
                suma = suma + matriz[i][j];
            }
        }

        int media = suma / totalDias;
        System.out.println("La temperatura media del mes es: " + media + "ºC.");
    }
    
    //Metodo quue dice cual dia es el mas calurosos
    public static void masCaluroso(int[][] matriz, String[] diasSemana) {
        int max = matriz[0][0];
        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIAS; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }

        System.out.println("El día o días más calurosos fueron:");

        
        for (int i = 0; i < SEM; i++) {
            for (int j = 0; j < DIAS; j++) {
                if (matriz[i][j] == max) {
                    System.out.println("• El " + diasSemana[j]
                            + " de la Semana " + (i + 1)
                            + " con " + max + " grados.");
                }
            }
        }
    }
}
