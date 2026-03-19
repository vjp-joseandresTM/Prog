/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Productos> listaProductos = new ArrayList<>();
        menuPrincipal(listaProductos);
    }

    public static void menuPrincipal(ArrayList<Productos> listaProductos) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n ----- MENU ----------------");
            System.out.println("1. Opciones de administracion ");
            System.out.println("2. Opciones de  compra.");
            System.out.println("3. Salir...");
            System.out.println("------------------------------");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuAdmin(listaProductos);
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Caracter no permitido, introduzca uno diferente.");
            }
        } while (opcion != 3);
    }

    public static void menuAdmin(ArrayList<Productos> listaProductos) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n ----- ADMINISTRACION DE PRODUCTOS-----");
            System.out.println("1. Introducir productos en la lista  ");
            System.out.println("2. Visualizar productos de la lista.");
            System.out.println("3. Eliminar productos de la lista.");
            System.out.println("4. Salir al menu principal.");
            System.out.println("-----------------------------------------");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    introProduc(listaProductos);
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Caracter no permitido, introduzca uno diferente.");
            }
        } while (opcion != 3);
    }
    
        public static void menuCompra(ArrayList<Productos> listaProductos) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n ------- COMPRAR  PRODUCTOS------------");
            System.out.println("1. Comprar productos  ");
            System.out.println("2. Salir al menu principal.");
            System.out.println("-----------------------------------------");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Caracter no permitido, introduzca uno diferente.");
            }
        } while (opcion != 3);
    }
    
    public static void introProduc(ArrayList<Productos> listaProductos){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del producto: ");
        String nProducto = sc.nextLine();
        System.out.print("Introduce el precio del producto: ");
        Float fPrecio = sc.nextFloat();
        System.out.print("Introduce el numero de Stock disponible: ");
        int nStock = sc.nextInt();
        listaProductos.add(new Productos(nProducto, fPrecio, nStock));
    }
    
    public static void mostrarProducto (ArrayList<Productos> listaProductos){
        for (int i = 0; i < listaProductos.size(); i++) {
            
        }
    }
    

}
