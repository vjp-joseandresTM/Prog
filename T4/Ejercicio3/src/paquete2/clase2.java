/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author DAM
 */
public class clase2 {
    public static void comparacion(int a, int b, int c){
        int mayor = 0;
        if(a>=b && a>=c){ //Se comparan los numeros haciendo que se determine cual es el mas grande.
            mayor = a;
            System.out.println("El mayor es" + a);
        }else if(b>=a && b>=c){// si el mayor no es el a, se comprobara el b, lo mismo pasara si es el c
            mayor = b;
            System.out.println("El mayor es" + b);
        }else{
            mayor = c;
            System.out.println("El mayor es" + c);
        }
   }   
}
