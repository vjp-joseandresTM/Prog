/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9_ej2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T9_EJ2 {

    /**
     * @param args the command line arguments
     */
    
    //Pedimos una cadena de caracteres y la fragmentamos en trocitos con un bucle.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = sc.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
    
}
