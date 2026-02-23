/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T10_EJ1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    //Llamada a los metodos 
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<>();//Creamos una lista con String
        rellenar(nombres);
        mostrar(nombres);
    }
    
    public static void rellenar(ArrayList<String>lista){
        Scanner sc = new Scanner(System.in);
        String respuesta;//Creamos un string de respuesta del usuario
        do{
            System.out.println("Introduce el numero: ");
            String nombres = sc.nextLine();
            lista.add(nombres);
            System.out.println("Quieres introducir otro nombre s/n");
            respuesta = sc.nextLine().toLowerCase();
        }while(respuesta.equalsIgnoreCase("S"));//Mientras que el usuario no presione otra tecla q no sea S 
    }
    
    public static void mostrar(ArrayList<String> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("--"+ lista.get(i));
        }
    }
    
}
