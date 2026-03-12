/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paraexamen1;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class ParaExamen1 {

    public final static int FIL = 3;
    public final static int COL = 4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche[][] aparcamientos = new Coche[FIL][COL];
        int[] paOrd = {4, 2, 7, 1};
        ordenar(paOrd);
        menu(aparcamientos);

    }

    public static void ordenar(int[] paOrd) {
        int aux;
        System.out.println("DESORDENAU");
        for (int i = 0; i < paOrd.length; i++) {
            System.out.println(paOrd[i]);
        }
        System.out.println("\n Ordenau");
        for (int i = 0; i < paOrd.length - 1; i++) {
            for (int j = 0; j < paOrd.length - 1 - i; j++) {
                if (paOrd[j] > paOrd[j + 1]) {
                    aux = paOrd[j];
                    paOrd[j] = paOrd[j + 1];
                    paOrd[j + 1] = aux;

                }

            }

        }
        for (int i = 0; i < paOrd.length; i++) {
            System.out.println(paOrd[i]);
        }
    }

    public static void menu(Coche[][] parking) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n **************Menu de gestion del parking*****************");
            System.out.println("1. Introducir coches");
            System.out.println("2. Mostrar coches del parking");
            System.out.println("3. Buscar coche por matricula");
            System.out.println("4. Mostrar coche con revisiones mas caras");
            System.out.println("5. Salir del programa");

            System.out.println("\n **********************************************************");
            System.out.print("\nINTRODUCE UNA OPCION: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    rellenar(parking);
                    break;
                case 2:
                    mostrar(parking);
                    break;
                case 3:
                    buscador(parking);
                    break;
                case 4:
                    reviMascara(parking);
                    break;
                case 5:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);
    }

    public static void rellenar(Coche[][] parking) {
        System.out.println("OPCION 1: ");
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {

                System.out.println("Introduce la info del coche a rellenar");
                parking[i][j] = new Coche();
                parking[i][j].introducirInformacion();

            }
        }
    }

    public static void mostrar(Coche[][] parking) {
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (parking[i][j] != null) {
                    parking[i][j].mostrarInfoCoche();

                }
            }
        }
        System.out.println("\n");
    }

    public static void reviMascara(Coche[][] parking) {
        int caro = 0;
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (parking[i][j] != null) {
                    if (caro < parking[i][j].caclMedia()) {
                        caro = parking[i][j].caclMedia();
                    }
                }
            }
        }
        System.out.println("Revision mas cara: " + caro);
    }

    public static void buscador(Coche[][] parking) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce matrícula a buscar: ");
        String mat = sc.nextLine();

        int i = 0, j = 0;
        boolean encontrado = false;

        do {
            if (parking[i][j] != null && parking[i][j].getMatricula().equalsIgnoreCase(mat)) {
                System.out.println("Coche encontrado:");
                System.out.println("Fila: " + i);
                System.out.println("Columna: " + j);
                System.out.println("Marca: " + parking[i][j].getMarca());
                encontrado = true;
            }

            j++;
            if (j == COL) {
                j = 0;
                i++;
            }

        } while (!encontrado && i < FIL);

        if (!encontrado) {
            System.out.println("No existe ningún coche con esa matricula.");
        }
    }

}
