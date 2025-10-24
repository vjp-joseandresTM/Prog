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
 public static void comparacion(int a, int b, int c,int mayor){
     if(a>=b && a>=c){
         mayor = a;
         System.out.println("El mayor es" + a);
     }else if(b>=a && b>=c){
         mayor = b;
         System.out.println("El mayor es" + b);
     }else{
         mayor = c;
         System.out.println("El mayor es" + c);
     }
}   
}
