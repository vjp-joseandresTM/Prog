/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11_ej2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T11_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrinc();
    }

    public static void menuPrinc() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n______________MENU PRINCIPAL______________");
            System.out.println("1. Menu de Administracion.");
            System.out.println("2. Menu de Compra.");
            System.out.println("3. Salir.");
            System.out.println("___________________________________________");
            System.out.print("\n Intoroduce una opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo del programa... ");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 3);
    }

    public static void menuAdmin() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n______________MENU ADMINISTRACION_________");
            System.out.println("1. Introducir productos en la lista.");
            System.out.println("2. Visualizar todos los productos.");
            System.out.println("3. Eliminar productos de la lista.");
            System.out.println("4. Volver al menu de inicio");
            System.out.println("___________________________________________");
            System.out.print("\n Intoroduce una opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                    
                default:
                    throw new AssertionError();
            }
        } while (opcion != 4);
    }
    
        public static void menuCompra() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n______________MENU ADMINISTRACION_________");
            System.out.println("1. Mostrar lista de productos para comprar.");
            System.out.println("2. Comprar producto.");
            System.out.println("3. .");
            System.out.println("4. Volver al menu de inicio");
            System.out.println("___________________________________________");
            System.out.print("\n Intoroduce una opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                    
                default:
                    throw new AssertionError();
            }
        } while (opcion != 4);
    }

}
