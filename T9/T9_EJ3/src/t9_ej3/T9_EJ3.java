/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9_ej3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9_EJ3 {

    /**
     * @param args the command line arguments
     */
    //Lo mismo que con el anterior pero en este caso troceamos la palabra con toCharArray.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = sc.nextLine();
        char[] separacion = cadena.toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(separacion[i]);
        }
    }
    
}
