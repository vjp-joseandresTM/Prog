/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T12_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n");
            System.out.println("============== MENÚ =============");
            System.out.println("1. Añadir contactos.");
            System.out.println("2. Visualizar contactos.");
            System.out.println("3. Eliminar contactos.");
            System.out.println("4. Ordenar contactos por edad.");
            System.out.println("5. Salir del programa.");
            System.out.println("=================================");
            System.out.print(" []Introduce una opcion: ");
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
                
                case 5:
                    break;
                default:
                    System.out.println("\n Opcion invalida, por favor seleccione una valida(1-5)");
            }
        } while (true);
    }
    
    public static void addContacto(){
        
    }
}
