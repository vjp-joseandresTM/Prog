/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_12 {

    /**
     * @param args the command line arguments
     */
    
    //Creacion de la lista y llamada a los metodos.
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        rellenar(nombres);
        mostrar(nombres);
    }

    //Metodo rellenar, mientras el usuario no mande X como nombre el metodo no se detentra, la x no se añadira.
    public static void rellenar(ArrayList<String> nombres) {
        Scanner sc = new Scanner(System.in);
        String addNom;
        do {
            System.out.println("Añade un nommbre o escribe X para salir: ");
            addNom = sc.nextLine();
            if (!addNom.equalsIgnoreCase("x")) {
                nombres.add(addNom);
            }

        } while (!addNom.equalsIgnoreCase("x"));
    }
    //Mostramos con un Itinerador las posiciones
    public static void mostrar(ArrayList<String> nombres) {
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            String nom = it.next();
            System.out.println(nom);
        }
    }

}
