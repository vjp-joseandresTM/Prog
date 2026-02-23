/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listNumeros = new ArrayList<>();
        
    }
    
    public static void rellenar(ArrayList<Integer>listNumeros){
        Scanner sc = new Scanner(System.in);
        int numeroIntroducir;
        boolean salir = false;
        do { 
            System.out.println("Introduce un numero: ");
            numeroIntroducir = sc.nextInt();
            listNumeros.add(numeroIntroducir);
            
        } while (salir != true);
    }
    
}
