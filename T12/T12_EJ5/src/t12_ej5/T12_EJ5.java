/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej5;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T12_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        menu(contactos);
    }
    public static void menu(ArrayList<Contacto> contactos){
        Scanner sc = new Scanner(System.in);
        int opcion ;
        
        do {    
            System.out.println("Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    contactosAdd(contactos);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo");
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }
    public static void contactosAdd(ArrayList<Contacto> contactos){
        Scanner sc = new Scanner(System.in);
        String nom;
        int ed;
        int num;
        String opcion;
        do {            
            System.out.print("Introduce un nombre: ");
            nom = sc.nextLine();
        
            
            System.out.print("Introduce la edad: ");
            ed = sc.nextInt();
                    sc.nextLine();
            
            System.out.print("Introduce el numero de telefono: ");
            num = sc.nextInt();
                    sc.nextLine();
            Contacto c = new Contacto(nom,ed, num);
            contactos.add(c);
            
            System.out.println("Pulse s para añadir otro contacto:");
            opcion = sc.nextLine();
            
        } while (opcion.equalsIgnoreCase("s"));
    }
    public static void añadirContacto(ArrayList<Contacto> contactos){
        
    }
    
}
