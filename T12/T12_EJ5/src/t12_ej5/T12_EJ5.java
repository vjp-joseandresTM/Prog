/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12_ej5;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
        //Creamos la lista y llamamos al menu.
    }

        //Llamamos a las opciones del menu.
    public static void menu(ArrayList<Contacto> contactos) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Introducir contactos en la lista.");
            System.out.println("2. Leer lista de contactos. ");
            System.out.println("3. Salir del programa");
            System.out.println("=====================================");
           
            System.out.println("Introduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    contactosAdd(contactos);
                    break;
                case 2:
                    leerFichero();
                    break;
                case 3:
                    System.out.println("Saliendo");
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }
    //Creamos cada contacto dentro de la lista, y cuando ya no queramos introducir mas estos se escriben en la lista.
    public static void contactosAdd(ArrayList<Contacto> contactos) {
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
            Contacto c = new Contacto(nom, ed, num);
            contactos.add(c);

            System.out.println("Pulse s para añadir otro contacto:");
            opcion = sc.nextLine();

        } while (opcion.equalsIgnoreCase("s"));
        guardarFichero(contactos);
    }
    //Metodo que escribe la lista dentro del fichero.
    public static void guardarFichero(ArrayList<Contacto> contactos) {
        try (FileWriter fw = new FileWriter("contactos.txt", true)) {
            for (Contacto c : contactos) {
                fw.write(c.getNombre() + ";" + c.getEdad() + ";" + c.getNumero() + "\n");
                fw.write("");
                fw.write("------------------------------------------------");
                fw.write("");
            }
            System.out.println("Contactos guardados correctamente en agenda.txt");
        } catch (IOException e) {
            System.out.println("ERROR, al escribir el fichero");
        }
    }
    
    // Leemos el fichero .
    public static void leerFichero() {
        System.out.println("\n ========== CONTACTOS DEL FICHERO ========");
        try (BufferedReader br = new BufferedReader(new FileReader("contactos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error con el Fichero");
        }
    }

}
