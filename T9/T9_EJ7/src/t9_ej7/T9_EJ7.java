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
        //Pedimos una frase al usuario.
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase y veras la magia: ");
        frase = sc.nextLine();
        
        //Desmembramos esa frase por cada espacio.
        String[] cadena = (frase.split(" "));
        
        //Recorremos el array de la cadena de forma inversa
        for (int i = cadena.length -1; i >= 0; i--) {
            System.out.print(cadena[i]+" ");
        }
    }
    
}
