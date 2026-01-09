/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ej12;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class T5_ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cateto1;
        int cateto2;
        
        System.out.println("Introduce el primer Cateto: ");
        cateto1 = sc.nextInt();
        System.out.println("Introduce el segundo Cateto: ");    
        cateto2 = sc.nextInt();
        
        Triangulo triangulo1 = new Triangulo(cateto1, cateto2);
        
        triangulo1.mostrarResultado();
        
        
    }

}
