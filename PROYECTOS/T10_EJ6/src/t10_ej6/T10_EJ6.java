/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        menu(listaNum, meses);
    }

    public static void menu(ArrayList<Integer> listaNum, String[] meses) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("1.Introducir las ventas de coches de cada uno de los 12 meses del año.");
            System.out.println("2.Mostrar las ventas introducidas en el punto anterior.");
            System.out.println("3.Mostrar las ventas introducidas al revés.");
            System.out.println("4.Que muestre la suma total de ventas del año.");
            System.out.println("5.Que muestre las ventas totales de los meses cuyo nombre contenga la letra a.");
            System.out.println("6.Que muestre el nombre del mes (o meses) con más ventas.");
            System.out.println("7.Salir del programa");
            System.out.println("\n");
            System.out.print("Introduce una opcion (1-7): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarVentas(listaNum, meses);
                    break;
                case 2:
                    mostrarVentas(listaNum, meses);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 7);

    }
    
    public static void rellenarVentas(ArrayList<Integer> listaNum, String[] meses){
        Scanner sc = new Scanner(System.in);
        int ventas;
        for (int i = 0; i < meses.length; i++) {
            System.out.println("Introduce las ventas de "+meses[i]);
            ventas = sc.nextInt();
        }
    }
    
    public static void mostrarVentas(ArrayList<Integer> listaNum, String[] meses){
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i] + listaNum.get(i));
        }
    }
}
