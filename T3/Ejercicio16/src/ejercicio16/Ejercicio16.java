/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author DAM
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 21 ;
       int contador = 0;
        do {            
            System.out.println(i);
            i += 2;
            contador += 1;  // Esta variable sirve como un contador, pues en cada vuelta se suma 1
        } while (i<=160);
        
        System.out.println("EL NUMERO DE NUMEROS IMPARES IMPRESOS EN PANTALLA ES DE " + contador); 

    }
}
