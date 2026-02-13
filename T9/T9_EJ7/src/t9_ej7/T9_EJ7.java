/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9_ej7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9_EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase y veras la magia: ");
        frase = sc.nextLine();
        String[] cadena = (frase.split(" "));
        for (int i = cadena.length -1; i >= 0; i--) {
            System.out.print(cadena[i]+" ");
        }
    }
    
}
