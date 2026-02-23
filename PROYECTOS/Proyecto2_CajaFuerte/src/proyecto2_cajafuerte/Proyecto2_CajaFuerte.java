/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2_cajafuerte;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto2_CajaFuerte {

    public final static int FIL = 3;
    public final static int COL = 3;

    /**
     * @param args the command line arguments
     */
    //Llamo a los metodos y creo m1.
    public static void main(String[] args) {
        Monedas[][] m1 = new Monedas[FIL][COL];
        menu(m1);
    }

    //Llamo a los metodos necesarios de cada opcion
    public static void menu(Monedas[][] m1) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Caja Fuerte ---");
            System.out.println("1. Rellenar Caja");
            System.out.println("2. Mostrar Material");
            System.out.println("3. Mostrar moneda mas valiosa");
            System.out.println("4. Salir del programa.");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    numsIntro(m1);
                    break;
                case 2:
                    mostrarMaterial(m1);
                    break;
                case 3:
                    mostrasValiosa(m1);
                    break;
                case 4:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Introduce una opcion correcta!");
            }
        } while (opcion != 4);
    }

    public static void numsIntro(Monedas[][] m1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los Datos:");
        for (int i = 0; i < FIL; i++) {

            for (int j = 0; j < COL; j++) {//Recorro la matriz rellenando cada moneda con su informacion
                System.out.println("Introduce Valor");
                int valor = sc.nextInt();
                System.out.print("Introduce Pais: ");
                String pais = sc.nextLine();
                sc.nextLine();//Limpio buffer
                System.out.println("Introduce Material: ");
                String material = sc.nextLine();
                m1[i][j] = new Monedas(valor, pais, material);
            }
        }
    }

    public static void mostrarMaterial(Monedas[][] m1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el material a buscar: ");
        String material = sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < FIL; i++) {//Recorro las posiciones y comparo el material introducido con el que tiene cada posicion
            for (int j = 0; j < COL; j++) {
                if (m1[i][j].getMaterial() == material) {
                    System.out.println(m1[i][j]);
                }
            }
        }

    }

    public static void mostrasValiosa(Monedas[][] m1) {
        Monedas mayor = m1[0][0];
        int fil = 0;//Defino Filas y columnas para luego determinar la posicion
        int col = 0;
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {//Recorro las posiciones comparando cada una y guardando la que es mayor
                if (m1[i][j].getValor() > mayor.getValor()) {
                    mayor = m1[i][j];
                    fil = i;
                    col = j;//Establezco que los valores sean los de i y j
                }

            }
        }
        System.out.println("La mas valiosa: " + mayor + "En la Fila: " + fil + " Columna:" + col);

    }

}
